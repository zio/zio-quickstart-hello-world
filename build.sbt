enablePlugins(ZioSbtEcosystemPlugin)

ThisBuild / name := "ZIO Quickstart Hello World"

ThisBuild / ciEnabledBranches := Seq("master")
ThisBuild / ciUpdateReadmeJobs := Seq.empty
ThisBuild / ciReleaseJobs := Seq.empty
ThisBuild / ciPostReleaseJobs := Seq.empty
ThisBuild / ciCheckWebsiteBuildProcess := Seq.empty

lazy val root =
  project
    .in(file("."))
    .settings(stdSettings("zio-quickstart-hello-world"))
    .settings(enableZIO())
