#!/bin/bash
for i in ./lib/*.jar
do
    CLASSPATH="$i:$CLASSPATH"
done

MainJar="hello3.jar" 
MainClass="com.yanxml.parent.son.HelloMain"
CLASSPATH="$MainJar:$CLASSPATH"


echo "$CLASSPATH"
java -cp "$CLASSPATH" "$MainClass"
