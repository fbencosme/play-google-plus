import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName = "test"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "g+" % "g+_2.9.1" % "1.0-SNAPSHOT")

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings( // Add your own project settings here      
  )

}
