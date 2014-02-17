package com.caseystella.analysis


import org.scalatest.BeforeAndAfterAll
import org.scalatest.FunSuite

import org.apache.spark.SparkContext
import com.caseystella.spark.util.LocalSparkContext

class TestAnalysis extends FunSuite with LocalSparkContext {
  test("Test Simple Command Set -- TFIDF") {
    val commands =
     "history | awk '{print $2}' | awk 'BEGIN {FS=\"|\"}{print $1}' | sort | uniq -c | sort -n | tail | sort -nr\nKEY_HASH=`openssl rsa -in $KEY_PATH -modulus -noout | openssl md5` && CRT_HASH=`openssl x509 -in $CERT_PATH -modulus -noout | openssl md5`; if [ \"$KEY_HASH\" != \"$CRT_HASH\" ];then         echo \"MD5 sums between .key and .crt files DO NOT MATCH\";fi\necho -n \"String to MD5\" | md5sum | awk '{print $1}'\nfind /var/www/ -type f -name \".htaccess\" -exec perl -pi -e 's/AddHandler[\\s]*php(4|5)-cgi/AddHandler x-httpd-php\\1/' {} \\;\nls -l | awk '{k=0;for(i=0;i<=8;i++)k+=((substr($1,i+2,1)~/[rwx]/)*2^(8-i));if(k)printf(\"%0o \",k);print}'\nfind /tank -iname thumbs.db -print0 | xargs -0 rm\nbase64 /dev/urandom | head -c 33554432 | split -b 8192 -da 4  - dummy.\nfind . -type f -exec du -sh {} + | sort -hr | head\nbrd = \"! f() { for k in $(git branch $@ | sed 's/^..//; s/ .*//'); do  echo \"$(git log -1 --pretty='%Cgreen%ci %Cblue(%cr)%Creset ' $k) $k\" ;  done | sort -r; }; f\"\ngit log --name-only | less" .split('\n').toList
    val commandsRdd = sc.makeRDD(commands, 2)
    assert(commandsRdd.collect().toList == commands);

    val scoredBigrams = new Analysis().tfidf(commandsRdd)
    System.out.println(scoredBigrams.collect().toList)
  }

  test("Test Simple Command Set -- MI") {
    val commands = List("ls -l | grep blah", "ls | history | sort | uniq -c", "ls -l | grep foo")
    /*
     *  P(Bigrams): (ls, grep) == 2/5
     *            , (history, sort) = 1/5
     *            , (sort, uniq) = 1/5
     *            , (ls, history) = 1/5
     *  P(Command): ls = 3/8
     *            , grep = 2/8
     *            , history = 1/8
     *            , sort = 1/8
     *            , uniq = 1/8
     *
     *  MI = (ls, grep) = log_2( (2/5) / ((3/8)* (2/8))) == 2.0931
     *     , (history, sort) = log_2( (1/6) / ( (1/8) * (1/8))) == 3.6781
     *     , (sort, uniq) == 3.6781
     *     , (ls, history) == 3.6781
     */
    val commandsRdd = sc.makeRDD(commands, 2)
    assert(commandsRdd.collect().toList == commands);

    val scoredBigrams = new Analysis().mutualInformation(commandsRdd)
    val collectedBigrams = scoredBigrams.collect().toList
    System.out.println(collectedBigrams)
    assert( collectedBigrams.size == 4)
  }
}
