#!/bin/bash

if [ $# == 0 ] ; then
    echo "USAGE: $0 dev|test|prod"
    exit 1;
fi

./stop.sh
./start.sh $1
