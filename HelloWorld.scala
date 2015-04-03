/* indent HelloWorld.scala
   mkdir classes
   scalac -d classes HelloWorld.scala
   scala -classpath classes HelloWorld

vuhung@d3330:~/tmp/learn-scala$ scala HelloWorld.scala
Hello, world!


*/

/*
vuhung@d330:~/tmp/learn-scala$ scala -classpath classes HelloWorld
Hello, world!
*/

object HelloWorld
{
  def main (args:Array[String])
  {
  println ("Hello, world!")}
}
