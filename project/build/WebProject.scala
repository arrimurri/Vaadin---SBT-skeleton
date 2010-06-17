import sbt._

class WebProject(info: ProjectInfo) extends DefaultWebProject(info) {
	val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test"
}
