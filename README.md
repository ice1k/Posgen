# Posgen

[![Build status](https://ci.appveyor.com/api/projects/status/dlv791btwl33ifsu?svg=true)](https://ci.appveyor.com/project/ice1000/posgen)

This is a very simple program for personal usage.

# Download release

+ [AppVeyor](https://ci.appveyor.com/project/ice1000/posgen/build/artifacts)

# Api

See [this interface file](src/js/org/ice1000/JsInterface.kt).

It's Kotlin but it shows all the interface provided.

# Build and test

This project is cross-kotlin-backend. When testing, use the JVM-backend of Kotlin. Otherwise use the JS-backend.

## Build

Building this project under KotlinJS is quite simple:

```shell
$ gradle zipWeb
$ npm install
```

## Test

Since unit-testing on KotlinJS is quite painful, I used Kotlin JVM to do unit-testing.

You should edit [build.gradle](./build.gradle). Find this line (in the top few lines, this should be easy):

```scala
def runTestMode = false
```

Change it to:

```scala
def runTestMode = true
```

Then run:

```shell
$ gradle test
```