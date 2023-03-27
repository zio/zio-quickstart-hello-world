enablePlugins(ZioSbtEcosystemPlugin)

inThisBuild(
  List(
    name := "ZIO Quickstart Hello World",
    crossScalaVersions := Seq(scala213.value),
    ciEnabledBranches := Seq("master"),
    ciDefaultTargetJavaVersions := Seq("8"),
    ciTargetScalaVersions :=
      makeTargetScalaMap(
        zioQuickstartHelloWorld,
        zioQuickstartKafka
      ).value,
    ciUpdateReadmeJobs := Seq.empty,
    ciReleaseJobs := Seq.empty,
    ciPostReleaseJobs := Seq.empty,
    ciCheckWebsiteBuildProcess := Seq.empty
  )
)

lazy val root = project
  .in(file("."))
  .settings(publish / skip := true)
  .aggregate(zioQuickstartHelloWorld)

lazy val zioQuickstartHelloWorld =
  project
    .in(file("zio-quickstart-hello-world"))
    .settings(stdSettings("zio-quickstart-hello-world"))
    .settings(enableZIO())

lazy val zioQuickstartKafka =
  project
    .in(file("zio-quickstart-kafka"))
    .settings(stdSettings("zio-quickstart-kafka"))
    .settings(enableZIO(enableStreaming = true))
    .settings(
      libraryDependencies ++= Seq(
        "dev.zio" %% "zio-kafka" % "2.0.0-M3",
        "dev.zio" %% "zio-json" % "0.3.0-RC7"
      )
    )
