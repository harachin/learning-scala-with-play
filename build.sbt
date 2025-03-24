name := "Learning Scala with PlayFramework"
organization := "com.harachin"
scalaVersion := "3.6.4"
version      := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
