package exercises

// http://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/scala-tutorial-learn-use-option-function-parameters/
object FunctionWithOptionParameter {
  def main(args: Array[String]): Unit = {
    val cost = calculateDonutCost("Glazed donut", 4, None)
    println(cost)
  }

  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }
}
