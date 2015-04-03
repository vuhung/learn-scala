/*
Error with scala 2.9
vuhung@d330:~/tmp/learn-scala$ scalac -deprecation -classpath classes/ complexOps.scala 
complexOps.scala:1: warning: trait Application is deprecated: use App instead
object complexOps extends Application {
                          ^
one warning found

/*

It is ok with scala 2.11

vuhung@d3330:~/tmp/learn-scala$ scalac -classpath classes/ complexOps.scala
vuhung@d3330:~/tmp/learn-scala$ scala complexOps
3.0+4.0*i

vuhung@d3330:~/tmp/learn-scala$ scala -version
Scala code runner version 2.11.6 -- Copyright 2002-2013, LAMP/EPFL
*/

//object complexOps extends Application {
object complexOps extends App {
  class Complex(val re: Double, val im: Double) {
    def + (that: Complex) =
      new Complex(re + that.re, im + that.im)
    def - (that: Complex) =
      new Complex(re - that.re, im - that.im)
    def * (that: Complex) =
      new Complex(re * that.re - im * that.im,
                  re * that.im + im * that.re)
    def / (that: Complex) = {
      val denom = that.re * that.re + that.im * that.im
      new Complex((re * that.re + im * that.im) / denom,
                  (im * that.re - re * that.im) / denom)
    }
    override def toString =
      re + (if (im < 0) "-" + (-im) else "+" + im) + "*i"
  }
  val x = new Complex(2, 1); val y = new Complex(1, 3)
  println(x + y)
}
