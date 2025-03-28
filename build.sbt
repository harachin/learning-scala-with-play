name := "Learning Scala with PlayFramework"
organization := "com.harachin"
scalaVersion := "3.6.4"
version := "1.0.0"
scalafmtOnCompile := false
scalafixOnCompile := false

lazy val root = (project in file("."))
  .settings(
    scalacOptions ++= Seq(
      s"-Wconf:src=${target.value}/.*:s",
      "-Wunused:all"
    )
  )
  .enablePlugins(PlayScala)

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
