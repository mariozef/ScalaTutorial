package Tut4

/**
  * Created by mariozef on 2016-11-11.
  */
object Demo {
  def main(args: Array[String]) {
    println( "multiplier(1) value = " +  multiplier(1) )
    println( "multiplier(2) value = " +  multiplier(2) )
  }
  var factor = 3
  val multiplier = (i:Int) => i * factor
}