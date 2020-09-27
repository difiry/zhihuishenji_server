#!/bin/bash

BASE_DIR="/home/rf/apps/wjcrm"

shutdown() {
    echo "stop Stopping..."
    kill -9 `cat $BASE_DIR/app.pid`
    rm -rf $BASE_DIR/app.pid
    echo "stop [Success]"
}

echo ""
shutdown
echo ""
