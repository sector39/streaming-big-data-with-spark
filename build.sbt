name := "spark-streaming"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion = "3.0.0-preview"

libraryDependencies ++= Seq(
//  "org.twitter4j" % "twitter4j-core" % "4.0.4",
//  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.4.0",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion
)
