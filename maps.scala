/*
  689  scalac maps.scala

vuhung@d330:~/tmp/learn-scala$ scala Maps red
red has code: 16711680
vuhung@d330:~/tmp/learn-scala$ scala Maps red black
red has code: 16711680
black has code: 0

*/

/** Maps are easy to use in Scala. */
object Maps {
  val colors = Map("red" -> 0xFF0000,
                   "turquoise" -> 0x00FFFF,
                   "black" -> 0x000000,
                   "orange" -> 0xFF8040,
                   "brown" -> 0x804000)
  def main(args: Array[String]) {
    for (name <- args) println(
      colors.get(name) match {
        case Some(code) =>
          name + " has code: " + code
        case None =>
          "Unknown color: " + name
      }
    )
  }
}

