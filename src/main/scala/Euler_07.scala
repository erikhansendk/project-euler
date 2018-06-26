object Euler_07 {
  def main(args: Array[String]): Unit = {
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


    println( makeListOfPrimes(10001).last ) // 104743

    // test
    assert (makeListOfPrimes(168).last == 997)

  }
}
