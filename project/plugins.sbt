// Makes our code tidy
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.3.0")

// Revolver allows us to use re-start and work a lot faster!
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")

// Native Packager allows us to create standalone jar
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.2")
