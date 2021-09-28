package exercises

// http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-create-function-implicit-parameter/
object FunctionWithImplicitParameter {
  def main(args: Array[String]): Unit = {
    println(totalCost("Donut", 10))
  }

  def totalCost(donutType: String, quantity: Int)(implicit discount: Double = 0.1): Double = {
    println(s"Calculating the price for $quantity $donutType")
    val totalCost = 2.50 * quantity * (1 - discount)
    totalCost
  }
}
