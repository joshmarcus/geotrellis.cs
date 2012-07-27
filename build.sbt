name := "conscript-example"

organization := "com.example"

version := "0.1.0-SNAPSHOT"

libraryDependencies <+= (sbtVersion) { v =>
  v.split('.').toList match {
    case "0" :: "11" :: "3" :: Nil  =>
       "org.scala-sbt" %%
        "launcher-interface" %
          v % "provided"
    case _ =>
      "org.scala-sbt" %
        "launcher-interface" %
          v % "provided"
  }
}

resolvers <+= sbtResolver
