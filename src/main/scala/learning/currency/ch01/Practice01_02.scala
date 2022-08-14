package learning.currency.ch01

object Practice01_02 extends App {

  def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] = {
    if (Seq(a, b).contains(None)) None else Some(a.get, b.get)
  }

  // test
  println(fuse(Some(1), Some("a")))
  println(fuse(None, Some(2)))
  println(fuse(Some(1), None))
  println(fuse(None, None))
}
