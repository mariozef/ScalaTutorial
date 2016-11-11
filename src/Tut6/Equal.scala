package Tut6

/**
  * Created by mariozef on 2016-11-11.
  */
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}
