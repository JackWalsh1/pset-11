#!/bin/sh

rm -rf grader/
rm -rf __MACOSX/
unzip -n grader.zip

javac ../src/Exercises.java -d ./
jar uf grader.jar Exercises.class
rm -rf Exercises.class

if [ $# -eq 0 ]; then
    echo
    echo "Usage: ./grademe.sh <exercise> <type> <ascending/target>"
    echo
    echo "Available exercises:"
    echo "  - findMe"
    echo "  - findMeFaster"
    echo "  - bubble"
    echo "  - insertion"
    echo "  - selection"
    echo "  - merge"
else
    java -jar grader.jar $1 $2 $3
fi

rm -rf *.jar