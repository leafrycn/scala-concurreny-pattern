package learning.currency.ch01

object Practice01_06 extends App {

  def combinations(n: Int, xs: Seq[Int]): Iterator[Seq[Int]] = {
    // println(helper(n, xs))
    helper(n, xs).iterator
  }

  def helper(n: Int, xs: Seq[Int]): Seq[Seq[Int]] = {
    if(n == 1) return xs.map(Seq(_))

    for {
      i <- 0 until xs.length - n + 1
      remainSeq <- helper(n - 1, xs.splitAt(i + 1)._2)
    } yield xs(i) +: remainSeq
  }

  // test
  combinations(2, Seq(1,2,3,4))
}
