scalaVersion := "2.13.8"
organization := "dev.zio"
name := "zio-quickstart-hello-world"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"         % "2.0.0-RC5",
  "dev.zio" %% "zio-streams" % "2.0.0-RC5",
  "dev.zio" %% "zio-kafka"   % "2.0.0-M3",
  "dev.zio" %% "zio-json"    % "0.3.0-RC7",
)
