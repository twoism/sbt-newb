import sbt._

class NewbProject(info: ProjectInfo) extends DefaultProject(info) {
  val jackson = "org.codehaus.jackson" % "jackson-core-asl" % "1.6.1"
  val specs = "org.scala-tools.testing" % "specs_2.8.0" % "1.6.5" % "test"
}
