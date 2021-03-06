lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "junit" % "junit" % "4.12" % Test,
      "com.novocode" % "junit-interface" % "0.11"
    )
  )
val scala3Version = "3.0.2"
