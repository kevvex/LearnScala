package exercises

import scala.collection.mutable.ListBuffer

object ShoppingCartItemEx2 {

  def main(args: Array[String]): Unit = {
    val iceCream = Item("vanilla ice cream", 2.99f, 10)
    val biscuits = Item("chocolate biscuits", 3.99f, 3)
    val cupcakes = Item("cupcakes", 3.99f, 5)

    val cart: ShoppingCart = new ShoppingCart(ListBuffer())
    cart.addItem(iceCream)
    cart.addItem(biscuits)
    cart.addItem(cupcakes)
    cart.showItems()
  }

  class ShoppingCart(val items: ListBuffer[Item]) {

    def showItems(): Unit = {
      items.foreach(e => {
        println(s"${e.quantity} ${e.name} at ${e.price} each")
      })
    }

    def addItem(item: Item): Unit = {
      items.addOne(item)
    }
  }

  case class Item(name: String, price: Float, quantity: Int)

}
