/*

vuhung@d3330:~/tmp/learn-scala$ scalac extendBuiltins.scala
scala warning: there were two feature warnings; re-run with -feature for details
one warning found
vuhung@d3330:~/tmp/learn-scala$ scala extendBuiltins
10! = 3628800

vuhung@d3330:~/tmp/learn-scala$ scalac -feature extendBuiltins.scala
extendBuiltins.scala:18: warning: implicit conversion method int2fact should be enabled
by making the implicit value scala.language.implicitConversions visible.
This can be achieved by adding the import clause 'import scala.language.implicitConversions'
or by setting the compiler option -language:implicitConversions.
See the Scala docs for value scala.language.implicitConversions for a discussion
why the feature should be explicitly enabled.
  implicit def int2fact(n: Int) = new Factorizer(n)
               ^
extendBuiltins.scala:20: warning: postfix operator ! should be enabled
by making the implicit value scala.language.postfixOps visible.
This can be achieved by adding the import clause 'import scala.language.postfixOps'
or by setting the compiler option -language:postfixOps.
See the Scala docs for value scala.language.postfixOps for a discussion
why the feature should be explicitly enabled.
  println("10! = " + (10!))
                        ^
two warnings found
vuhung@d3330:~/tmp/learn-scala$ scala -version
Scala code runner version 2.11.6 -- Copyright 2002-2013, LAMP/EPFL

*/

/* Adding ! as a method on int's */
object extendBuiltins extends App {
  def fact(n: Int): BigInt =
    if (n == 0) 1 else fact(n-1) * n
  class Factorizer(n: Int) {
    def ! = fact(n)
  }
  implicit def int2fact(n: Int) = new Factorizer(n)

  println("10! = " + (10!))
}

