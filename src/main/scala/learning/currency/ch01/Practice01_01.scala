package learning.currency.ch01

object Practice01_01 extends App{

  def compose[A, B, C](g: B => C, f: A => B): A => C = (a: A) => g(f(a))

  // test
  val g: Int => Int = (x: Int) => { x * 2 }
  val f: Int => Int = (x: Int) => { x + 1 }
  println(compose(g, f)(5))
}
