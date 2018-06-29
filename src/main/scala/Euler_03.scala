object Euler_03 {
  def main(args: Array[String]): Unit = {

    /**
      * The prime factors of 13195 are 5, 7, 13 and 29.
      *
      * What is the largest prime factor of the number 600_851_475_143 ?
      */

    /**
      * In order to brute force the problem, we need to use a small trick.
      * Any factor less than the square root of the number we check,
      * will have corresponding factor larger than the square root of the number.
      * So we only need to check up to the square root of the number,
      * and then we can deduct the remaining factors.
      */

    def getFactors(n: Long): List[Long] = {
      val factors = scala.collection.mutable.ListBuffer[Long](1L)
      if (n % 2 == 0) {   // check 2
        factors += 2
      }
      var i: Long = 3   // i starts checking at 3
      while ((i * i) <= n) { // the small factors (i < sqrt(n))
        if (n % i == 0) {
          factors += i
        }
        i = i + 2   // i starting at 3 - so +2 only checks the odd numbers
      }
      // calc the big factors - the twins
      for (t <- factors.reverse){
        factors += n / t
      }
      factors.toList  // return as List
    }

    def isPrime(n: Long): Boolean = {
      (n != 1) && getFactors(n) == List(1, n)
    }

    def getPrimeFactors(n: Long): List[Long] = {
      getFactors(n).filter( isPrime )
    }

    val theNumber = 600851475143L
    println ( getPrimeFactors (theNumber).max ) // 6857 OK


    // testing
    assert(getPrimeFactors(13195) == List(5, 7, 13, 29))
    assert(getPrimeFactors(theNumber) == List(71, 839, 1471, 6857))
  }
}
