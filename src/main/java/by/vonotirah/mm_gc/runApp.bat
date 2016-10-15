@echo off
set CLASSPATH=.
set CLASSPATH=%CLASSPATH%
java -Xms2m -Xmx18m -Xmn1m -XX:PermSize=24m -XX:MaxPermSize=36m -XX:ParallelGCThreads=2 -cp testJar.jar by.vonotirah.mm_gc.App
pause