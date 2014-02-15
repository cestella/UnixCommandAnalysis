package com.caseystella.util


import java.util
import scala.collection.JavaConversions._
import org.antlr.runtime.tree.CommonTree
import org.antlr.runtime.{CommonTokenStream, ANTLRStringStream}
import com.caseystella.parser.{bashastParser, bashastLexer}

/**
 * Created by cstella on 2/14/14.
 */
class CLIParserDriver {
  type CommandType = Tuple2[String, List[String]]
  type CommandBigram = Tuple2[String, String]

  def getSyntaxTree(commandLine : String) :CommonTree= {
    val lexer = new bashastLexer(new ANTLRStringStream(commandLine))
    val parser = new bashastParser(new CommonTokenStream(lexer))
    val tree = parser.start().getTree()
    tree
  }

  def getSubCommands(tree : CommonTree) : List[String] = {
    def getSubCommandsAccumulator(tree:CommonTree, accumulator:List[String]) : List[String] = {
      tree.getText match {
        case "COMMAND_SUB" => accumulator ++ getCommandTokens(tree).map( x => x._1)
        case _ => toList(tree.getChildren()).foldLeft(accumulator) { (acc, child) => acc ++ getSubCommandsAccumulator(child, List.empty[String]) }
      }
    }
    toList(tree.getChildren).foldLeft(List.empty[String]){ (acc, child) => acc ++ getSubCommandsAccumulator(child, List.empty[String]) }
  }

  def toList[E](list: util.List[E]) : List[CommonTree] = {
    list match {
      case null => List.empty[CommonTree]
      case _ =>  list.toList.asInstanceOf[List[CommonTree]]
    }
  }

  def getCommandTokens(tree : CommonTree) : List[CommandType] = {
    def getCommandTokensAccumulator(tree:CommonTree, accumulator : List[CommandType]) : List[CommandType]= {
      tree.getText match {
        case "COMMAND" => accumulator ++ List(new CommandType(tree.getChild(0).getChild(0).getText(), getSubCommands(tree)))
        case _ => toList(tree.getChildren()).foldLeft(accumulator){ (acc, child) => acc ++ getCommandTokensAccumulator(child, List.empty[CommandType]) }
      }
    }
    getCommandTokensAccumulator(tree, List.empty[CommandType])
  }


  def toCommandBigrams(commands : List[CommandType]) : List[CommandBigram] = {
    def getCommandsExceptMe(command: String): List[String] = {
      val projection = commands.map( (x:CommandType) => x._1).dropWhile(!_.equals(command)).drop(1)
        Set(projection: _*).toList.asInstanceOf[List[String]]
      }

    commands.foldLeft(List.empty[CommandBigram]){ (acc, command) => acc ++getCommandsExceptMe(command._1).map( (x) => (command._1, x) ) ++ command._2.map( (x) => (command._1, x) ) }
  }

}
