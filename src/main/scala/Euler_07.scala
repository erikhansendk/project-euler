object Euler_07 {
  def main(args: Array[String]): Unit = {

    /**
      * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
      *
      * What is the 10.001'st prime number?
      *
      */

    def makeListOfPrimes(size: Int): Seq[Int] = {
      @scala.annotation.tailrec
      def innerLoop(primes: Seq[Int], candidate: Int): Seq[Int] = {
        if (primes.length >= size) primes
        else {
          if (primes.forall(x => candidate % x != 0)) innerLoop(primes :+ candidate, candidate+2)
          else innerLoop(primes, candidate+2)

        }
      }
      innerLoop(Seq(2,3,5,7), 9)  // seeding data
    }


    println( makeListOfPrimes(10001).last ) // 104743 OK


    // testing
    assert (makeListOfPrimes(168).last == 997)

  }
}
