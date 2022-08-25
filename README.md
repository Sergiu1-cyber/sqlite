
compilez: javac -d classes **/*.java 

rulez: java -cp ".:sqlite-jdbc-3.39.2.0.jar:"classes main.Main 

ssh: rsync -ave 'ssh -p 8022' sqlite u0_a377@192.168.0.11:programare/java

creez jar: jar cfe sqlitedb.jar main.Main -C classes .

rulez jar: java -cp ".:sqlite-jdbc-3.39.2.0.jar:"sqlitedb.jar main.Main 

============================================================================
Manifestul
=============================================================================
Manifest-Version: 1.0
Created-By: 17.0.4 (Debian)
Main-Class: main.Main
Class-Path: ./sqlite-jdbc-3.39.2.0.jar
=============================================================================
calea: META-INF/MANIFEST.MF

compilez: jar cfm worker.jar classes/META-INF/MANIFEST.MF -C classes .


