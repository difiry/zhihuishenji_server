@echo off
set path=C:\Program Files\Java\jdk1.8.0_91\bin
START "demo-project" "%path%\javaw" -jar C:\ideaproject\external\trunk\target\outsource.file-1.0-SNAPSHOT.jar
pause