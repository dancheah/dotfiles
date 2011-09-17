import sbt._
import Keys._

object Plugins extends Build {
  lazy val root = Project("root", file("."), settings =
    Defaults.defaultSettings ++ Seq(
      libraryDependencies <++= (sbtVersion)(v => Seq(
        "me.lessis" %% "np" % "0.1.0-%s".format(v)
    )),
    resolvers += "lessis" at "http://repo.lessis.me"
  ))
}

import sbt._

// vim: set ts=4 sw=4 et:
