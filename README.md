# MavenRepoDemo
show how to upload you library(s) to  private maven repository

# USAGE

### 1. Copy the "aar_upload.gradle" file located in the root project into your root project.

### 2. Copy the "gradle.properties" file located in the library1 or library2 into your library module

### 3. Add `apply from: '../aar_upload.gradle'` script to your library-module build.gradle file then sync gradle.

### 4. Modify the key-value pairs in the "gradle.properties" which from step2 to yours.
