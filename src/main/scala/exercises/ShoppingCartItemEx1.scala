package exercises

// http://allaboutscala.com/tutorials/scala-exercises/#classes-functions-traits
/**
  *
  * Problem 1: Write a Scala program and use the Tuple type to represent a shopping cart item.
  * Each shopping cart item should have the following properties, namely, a name, a price,
  * use a case class to represent the above shopping cart item. You can use the following
  * shopping cart item as an example: A packet of rice at $10.99 and quantity bought is 5.
  *
  * Output:
  * A packet of rice is currently priced at $10.99, and the customer bought 5.
  * A packet of rice is currently priced at $10.99, and the customer bought 5.
  *
  **/
object ShoppingCartItemEx1 {

  def main(args: Array[String]): Unit = {
    val shoppingCartItem = ("rice", 10.99f, 5)
    println(s"A packet of ${shoppingCartItem._1} is currently priced at $$${shoppingCartItem._2}, " +
      s"and the customer bought ${shoppingCartItem._3}")

    val shoppingCart = ShoppingCart(shoppingCartItem)
    println(s"A packet of ${shoppingCart.item._1} is currently priced at $$${shoppingCart.item._2}, " +
      s"and the customer bought ${shoppingCart.item._3}")
  }

  case class ShoppingCart(var item: (String, Float, Int))

}
