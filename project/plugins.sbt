val zioSbtVersion = "0.4.0-alpha.6+6-3a627939-SNAPSHOT"

addSbtPlugin("dev.zio" % "zio-sbt-ci" % zioSbtVersion)
addSbtPlugin("dev.zio" % "zio-sbt-ecosystem" % zioSbtVersion)

resolvers ++= Resolver.sonatypeOssRepos("public")
