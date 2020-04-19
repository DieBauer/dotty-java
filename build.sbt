val dottyVersion = "0.23.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := dottyLatestNightlyBuild.get,//dottyVersion,
    // scalaVersion := dottyVersion,

    libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.2.6.RELEASE",
libraryDependencies += "javax.annotation" % "javax.annotation-api" % "1.3.2",
libraryDependencies += "com.github.spotbugs" % "spotbugs" % "4.0.2",

 libraryDependencies ++= Seq("org.glassfish.jersey.core" % "jersey-common",
 "org.glassfish.jersey.containers" % "jersey-container-servlet-core",
 "org.glassfish.jersey.inject" % "jersey-hk2").map(_% "2.30.1")
  )
