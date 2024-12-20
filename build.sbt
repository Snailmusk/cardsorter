import Dependencies._

ThisBuild / scalaVersion     := "3.4.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.snailmusk"
ThisBuild / organizationName := "concepts"

lazy val root = (project in file("."))
  .settings(
    name := "cardsorter",
    // libraryDependencies += munit % Test,
    libraryDependencies += scalatest 
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
