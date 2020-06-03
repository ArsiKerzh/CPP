import scala.annotation.tailrec
object ScalaLab5 extends App
{
  def RecursiveFibonacci(i: Int): Int =
  {
    def fib(last: Int, cur: Int, num: Int): Int =
    {
      if (num == 0) cur
      else fib(cur, last + cur, num - 1)
    }
    if (i < 0) -1
    else if (i == 0 || i == 1) 1
    else fib(1, 2, i - 2)
  }

  def tailRecursiveFibonacci(n: Int): Int =
  {
    @tailrec
    def fib2(n: Int, next: Int, acc: Int): Int = {
      if (n == 0) acc
      else fib2(n - 1, acc + next, next)
    }
    fib2(n, 1, 1)
  }
  //n=10
  (0 to 10).foreach((x: Int) => print(RecursiveFibonacci(x) + " "))
  println("")
  (0 to 10).foreach((x: Int) => print(tailRecursiveFibonacci(x) + " "))
}