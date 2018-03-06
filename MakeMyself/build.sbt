name := """MakeMyself"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.google.cloud" % "google-cloud-vision" % "1.12.0"
)
