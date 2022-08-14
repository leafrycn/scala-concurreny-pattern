package learning.currency.ch01

object Practice01_05 extends App {

  def permutations(x: String): Seq[String] = {
    helper("", x)
  }

  def helper(base: String, x: String): Seq[String] = {
    if(x.length == 1) return Seq(base + x)

    var res: Seq[String] = IndexedSeq()
    (x.indices zip x.toCharArray).foreach {
      case (i, c) => res ++= helper(base + c, x.substring(0, i) + x.substring(i + 1, x.length))
    }
    res
  }

  // test
  println(permutations("abcd"))
}
