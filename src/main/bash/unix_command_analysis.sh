#!/bin/bash
#example: --algo g_2 hdfs://namenode:8020/user/root/analysis/data/commands.dat hdfs://namenode:8020/user/root/analysis/out

$SPARK_HOME/bin/spark-class org.apache.spark.deploy.yarn.Client --jar unix_commands-assembly-0.0.1.jar --class com.caseystella.analysis.Driver --args "--master yarn-standalone $1" --num-workers 3 --master-memory 1g --worker-memory 512m --worker-cores 1
