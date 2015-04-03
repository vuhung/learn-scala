/*

vuhung@d3330:~/tmp/learn-scala$ scalac bigint.scala
vuhung@d3330:~/tmp/learn-scala$ scala bigint
50! = 30414093201713378043612608166064768844377641568960512000000000000
49! = 608281864034267560872252163321295376887552831379210240000000000
50!/49! = 50

*/

/** Bigint's can be used seamlessly */
object bigint extends App {
  def factorial(n: BigInt): BigInt =
    if (n == 0) 1 else n * factorial(n-1)

  val f50 = factorial(50); val f49 = factorial(49)
  println("50! = " + f50)
  println("49! = " + f49)
  println("50!/49! = " + (f50 / f49))
}
