#!/bin/bash
#校验有效性
if [ $# == 0 ] ; then
    echo "USAGE: $0 dev|test|prod"
    exit 1;
fi

ACTIVE=$1

cd `dirname $0`
cd ..
DEPLOY_DIR=`pwd`
RUN_JAR="$DEPLOY_DIR/app.jar"
LIB_DIR="$DEPLOY_DIR/lib"
WEBAPP_DIR="file:$DEPLOY_DIR/webapp"

#JVM设置
JVM="-Dloader.path=$LIB_DIR"
#运行内存分配
JVM="$JVM -Xmx1024m -Xms1024m -XX:PermSize=512m -XX:+HeapDumpOnOutOfMemoryError"
#运行参数设置
RUN_OPTS="-Dspring.profiles.active=$ACTIVE"
RUN_OPTS="$RUN_OPTS -Dspring.thymeleaf.prefix=$WEBAPP_DIR/templates/"
RUN_OPTS="$RUN_OPTS -Dspring.resources.static-locations=$WEBAPP_DIR/static/"

start() {
    JAVA_HOME=/usr/local/jdk1.8.0_101/
    export JAVA_HOME
    PATH=$JAVA_HOME/bin:.:$PATH
    export PATH
    echo "Starting"
    echo "java ${JVM} -jar ${RUN_OPTS} ${RUN_JAR}"
    nohup java ${JVM} -jar ${RUN_OPTS} ${RUN_JAR} > /dev/null 2>&1 &
    echo $! > $DEPLOY_DIR/app.pid
    echo "Finish"
}
echo ""
start
echo ""
