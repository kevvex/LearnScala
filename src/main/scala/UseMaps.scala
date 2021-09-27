object UseMaps {
  def main(args: Array[String]): Unit = {

    var treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")

    println(treasureMap(2))
  }
}