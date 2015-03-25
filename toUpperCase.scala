/*

  675  scalac -d classes toUpperCase.scala 
  677  scala -classpath classes toUpperCase i

vuhung@d330:~/tmp/learn-scala$ scala -classpath classes toUpperCase iii
Arguments: [Ljava.lang.String;@56a896fa

*/

/** Turn command line arguments to uppercase */
object toUpperCase {
  def main(args: Array[String]) {
    val res = for (a <- args) yield a.toUpperCase
    println("Arguments: " + res.toString)
  }
}
