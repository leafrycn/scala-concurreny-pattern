package learning.currency.ch01

object Practice01_03 extends App {

  def check[T](xs: Seq[T])(pred: T => Boolean): Boolean = {
    try {
      xs.map(pred).forall(_ == true)
    } catch {
      case _: Exception => false
    }
  }

  // test
  val seq = 0 until 40
  val pred1: Int => Boolean = _ >= 0
  println(check(seq)((x: Int) => { x % 2 == 0 })) // false
  println(check(seq)(pred1)) // true
  println(check(seq)(40 / _ > 0)) // false
}
