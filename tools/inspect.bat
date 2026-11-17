@echo off
setlocal
set DEXLIB=C:\Users\Jonathon\.gradle\caches\modules-2\files-2.1\com.github.MorpheApp.smali\smali-dexlib2\4220ae75f7\1ee4da573d0bf57d5a441e5f6db1859bbb28bdf6\smali-dexlib2-4220ae75f7.jar
set UTIL=C:\Users\Jonathon\.gradle\caches\modules-2\files-2.1\com.github.MorpheApp.smali\smali-util\4220ae75f7\2580789a553b27fe6fbba58a98dda2efc9640730\smali-util-4220ae75f7.jar
set GUAVA=C:\Users\Jonathon\.gradle\caches\modules-2\files-2.1\com.google.guava\guava\33.6.0-jre\c376b13067cc99a5774403530953f7b05a91e218\guava-33.6.0-jre.jar
java -cp "%~dp0out;%DEXLIB%;%UTIL%;%GUAVA%" InspectDex %*
