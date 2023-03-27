enablePlugins(ZioSbtEcosystemPlugin)

inThisBuild(
  List(
    name := "ZIO Quickstart Hello World",
    ciEnabledBranches := Seq("master"),
    ciTargetScalaVersions := makeTargetScalaMap(root).value,
    ciUpdateReadmeJobs := Seq.empty,
    ciReleaseJobs := Seq.empty,
    ciPostReleaseJobs := Seq.empty,
    ciCheckWebsiteBuildProcess := Seq.empty
  )
)

lazy val root =
  project
    .in(file("."))
    .settings(stdSettings("zio-quickstart-hello-world"))
    .settings(enableZIO())
