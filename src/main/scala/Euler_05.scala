object Euler_05 {
  def main(args: Array[String]): Unit = {

    /**
      * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
      *
      * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
      */

    // helper
    def isEvenlyDivisibleByAllNumbersFrom1ToX(i: Int, x: Int): Boolean = {
      @scala.annotation.tailrec
      def loop(i: Int, xList: List[Int]): Boolean = {
        xList match {
          case Nil => true
          case x :: xs => if (i % x != 0) false else loop(i, xs)
        }
      }
      if (x > i) false
      else {
        val numbers = 1.to(x).toList
        loop(i, numbers)
      }
    }


    def getMinIsEvenlyDivisibleByAllNumbersFrom1ToX(x: Int): Int = {
      var t = x
      while (!isEvenlyDivisibleByAllNumbersFrom1ToX(t,x)) {
        t = t + x
      }
      t
    }

    println(getMinIsEvenlyDivisibleByAllNumbersFrom1ToX(20)) // 232792560 OK (but slow - 7 sec'ish)


    // test helper
    assert (isEvenlyDivisibleByAllNumbersFrom1ToX(8, 4) == false)
    assert (isEvenlyDivisibleByAllNumbersFrom1ToX(12, 4) == true)
    assert (isEvenlyDivisibleByAllNumbersFrom1ToX(2520, 10) == true)
    assert (isEvenlyDivisibleByAllNumbersFrom1ToX(3, 10) == false)

    // test getMinIsEvenlyDivisibleByAllNumbersFrom1ToX
    assert (getMinIsEvenlyDivisibleByAllNumbersFrom1ToX(4) == 12)
    assert (getMinIsEvenlyDivisibleByAllNumbersFrom1ToX(10) == 2520)
  }
}
