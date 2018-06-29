object Euler_04 {
  def main(args: Array[String]): Unit = {

    /**
      * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
      * Find the largest palindrome made from the product of two 3-digit numbers.
      */

    def isPalindromicNumber(i: Int): Boolean = {
      val is = i.toString
      is.reverse == is
    }

    def generateProducts(): Seq[Int] = {
      for {
        a <- 1 to 999
        b <- 1 to 999
      } yield a * b
    }

    println(generateProducts().filter(isPalindromicNumber).max) // 906609 OK



    // just testing
    assert(isPalindromicNumber(9009))
    assert(isPalindromicNumber(343))
    assert(!isPalindromicNumber(3431))
  }
}
