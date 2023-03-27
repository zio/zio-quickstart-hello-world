scalaVersion := "3.1.3"
organization := "dev.zio"
name := "zio-quickstart-hello-world"

libraryDependencies += "dev.zio" %% "zio" % "2.0.1" 

ThisBuild / ciEnabledBranches := Seq("master")
ThisBuild / ciUpdateReadmeJobs := Seq.empty
ThisBuild / ciReleaseJobs := Seq.empty
ThisBuild / ciPostReleaseJobs := Seq.empty
ThisBuild / ciCheckWebsiteBuildProcess := Seq.empty