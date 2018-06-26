object Euler_04 {
  def main(args: Array[String]): Unit = {

    def isPalindromicNumber(i: Int): Boolean = {
      val is = i.toString
      is.reverse == is
    }

    def generateProducts(): Seq[Int] = {
      for {
        a <- 1 to 999
        b <- 1 to 999
      } yield a*b

    }



    println("9009 " + isPalindromicNumber(9009))
    println("343 "+ isPalindromicNumber(343))
    println("3431 "+ isPalindromicNumber(3431))

    println( generateProducts().filter( isPalindromicNumber ).max )   // 906609

  }

}
