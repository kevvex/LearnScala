object UseLists {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println("" + oneTwo + ", " + threeFour)
    println(oneTwoThreeFour)
  }
}