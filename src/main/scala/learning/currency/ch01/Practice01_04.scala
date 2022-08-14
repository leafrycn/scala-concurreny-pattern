package learning.currency.ch01

object Practice01_04 extends App {

  case class Pair[P, Q](first: P, second: Q)

  def matchPair(obj: Any): Unit = obj match {
    case p: Pair[_, _] => println (s"matched Pair (${p.first}, ${p.second})")
    case _ => println("match failed")
  }

  // test
  matchPair(Pair(1, "world"))
  matchPair(Pair("hello", "world"))
  matchPair(1L)

}
