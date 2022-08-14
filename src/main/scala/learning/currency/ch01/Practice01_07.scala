package learning.currency.ch01

import java.util.regex.Pattern
import scala.collection.mutable.ListBuffer

object Practice01_07 extends App {

  def matcher(regex: String): PartialFunction[String, List[String]] = {
    val pattern = Pattern.compile(regex)
    new PartialFunction[String, List[String]] {
      override def isDefinedAt(s: String): Boolean = pattern.matcher(s).find()
      override def apply(s: String): List[String] = {
        val matchers = pattern.matcher(s)
        val buffer = ListBuffer[String]()
        while(matchers.find()) {
          buffer += matchers.group()
        }
        buffer.toList
      }
    }
  }

  // test
  val pf = matcher("([a-z]+)")
  val elseAction = (x: String) => null
  println(pf.applyOrElse("a,b,c", elseAction))
  println(pf.applyOrElse("abc", elseAction))
  println(pf.applyOrElse("ABC", elseAction))

}
