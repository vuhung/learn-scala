/*
vuhung@d3330:~/IdeaProjects/learn-scala$ scala factorial.scala
3628800

*/
def factorial(x: Int): Int =
 */
  if (x == 0)
    1
  else
    x*factorial(x - 1)

println(factorial (10))