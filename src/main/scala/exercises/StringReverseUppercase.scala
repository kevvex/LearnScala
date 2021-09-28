package exercises

// http://allaboutscala.com/scala-exercises
// Problem #1
object StringReverseUppercase {
  def main(args: Array[String]): Unit = {
    val str: String = "http://allaboutscala.com/scala-exercises"
    val newStr = str.reverse.toUpperCase
    println(newStr)
  }
}