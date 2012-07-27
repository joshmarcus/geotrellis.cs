package com.example

import xsbti.{ AppMain, AppConfiguration }

object Main {
  def main(args: Array[String]) {
    run(args)
  }
  def run(args: Array[String]): Int = {
    println("Hello World: %s" format args)
    0
  }
}

class Script extends AppMain {
  def run(conf: AppConfiguration) =
    Exit(Main.run(conf.arguments))
}

case class Exit(val code: Int) extends xsbti.Exit
