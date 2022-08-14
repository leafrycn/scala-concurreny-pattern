lazy val ScalaConcurrencyPattern = (project in file("."))
  .settings(
    name := "ScalaConcurrencyPattern",
    libraryDependencies ++= Seq(
      "io.reactivex" %% "rxscala" % "0.27.0",
      "com.typesafe.akka" %% "akka-stream" % "2.6.19"
    )
  )
