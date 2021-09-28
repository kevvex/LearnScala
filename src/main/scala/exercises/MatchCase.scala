package exercises

object MatchCase {

  def main(args: Array[String]): Unit = {

    val name: String = "Bob"
    val version: String = "1.2.0"
    val id: String = "abc123abc123"

    val choice: Map[String, Any] = Map(
      "anyclass" -> AnyClass,
      "name" -> name,
      "version" -> version,
      "id" -> id
    )

    choice match {
      case map: Map[String, Any] =>
        println(s"${map("anyclass")}, " +
          s"${map("name")}, " +
          s"${map("version")}, " +
          s"${map("id")}"
        )
    }
  }

  case class AnyClass()

}
