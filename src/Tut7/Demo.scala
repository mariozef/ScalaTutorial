package Tut7

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

/**
  * Created by mariozef on 2016-11-11.
  */
object Demo {
  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>{
        println("Missing file exception")
      }

      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}
