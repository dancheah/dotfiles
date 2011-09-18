// SBT Eclipse Plugin
resolvers += {
  val typesafeRepoUrl = new java.net.URL("http://repo.typesafe.com/typesafe/releases")
  val pattern = Patterns(false, "[organisation]/[module]/[sbtversion]/[revision]/[type]s/[module](-[classifier])-[revision].[ext]")
  Resolver.url("Typesafe Repository", typesafeRepoUrl)(pattern)
}

libraryDependencies <<= (libraryDependencies, sbtVersion) { (deps, version) =>
  deps :+ ("com.typesafe.sbteclipse" %% "sbteclipse" % "1.3-RC3" extra("sbtversion" -> version))
}

// SBT IntelliJ Plugin
resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

libraryDependencies += "com.github.mpeltonen" %% "sbt-idea" % "0.10.0"

// vim: sts=4 sw=2 ts=2 et ft=scala
