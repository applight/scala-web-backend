name := "twilio-backend"
organization := "lighting.app.local.backend"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies ++= {
  Seq(  
    "com.typesafe" % "config" % "1.3.2",
    "com.twilio.sdk" % "twilio" % "7.51.0"
  )
}

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "lighting.app.local.backend.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "lighting.app.local.backend.binders._"
