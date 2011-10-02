// Eclipse Plugin
// https://github.com/typesafehub/sbteclipse
resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.4.0")

// IntelliJ Plugin 
// https://github.com/mpeltonen/sbt-idea
resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "0.11.0")

// Assembly Plugin
// https://github.com/eed3si9n/sbt-assembly
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.0")

// JRebel Plugin 
// https://github.com/Gekkio/sbt-jrebel-plugin
resolvers += "Jawsy.fi M2 releases" at "http://oss.jawsy.fi/maven2/releases"

addSbtPlugin("fi.jawsy.sbtplugins" %% "sbt-jrebel-plugin" % "0.9.0")

// Web Plugin
// https://github.com/siasia/xsbt-web-plugin
resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"    

addSbtPlugin("com.github.siasia" %% "xsbt-web-plugin" % "0.1.2")

// vim: sts=4 sw=2 ts=2 et ft=scala
