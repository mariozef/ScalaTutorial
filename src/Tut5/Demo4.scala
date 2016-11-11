package Tut5

import Array._

/**
  * Created by mariozef on 2016-11-11.
  */
object Demo4 {
  def main(args: Array[String]) {
    var myList1 = range(10, 20, 2)
    var myList2 = range(10,20)

    // Print all the array elements
    for ( x <- myList1 ) {
      print( " " + x )
    }

    println()
    for ( x <- myList2 ) {
      print( " " + x )
    }
  }
}
