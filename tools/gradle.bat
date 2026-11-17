@echo off
set GITHUB_ACTOR=dummy
set GITHUB_TOKEN=dummy
call "%~dp0..\gradlew.bat" %* --offline --console=plain
