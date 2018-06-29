object Euler_10 {
  def main(args: Array[String]): Unit = {
    /**
      * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
      *
      * Find the sum of all the primes below two million.
      */


    /**
      * My calc-primes method in Euler_07 is to show - Sieve of Eratosthenes to the rescue..
      *
      * Sieve of Eratosthenes was as the name implies invented by Eratosthenes who was a Greek Mathematician living around 200 BC.
      *
      * The algorithm needs to have an upper limit for the primes to find. Lets call this limit N
      *
      * The algorithm works as follows.
      *
      * Create a list l of consecutive integers {2,3,…,N}.
      * Select p as the first prime number in the list, p=2.
      * Remove all multiples of p from the l.
      * set p equal to the next integer in l which has not been removed.
      * Repeat steps 3 and 4 until p2 > N, all the remaining numbers in the list are primes
      */

    import scala.collection.mutable.ArraySeq

    def findPrimesAndSum(size: Int): (Long, ArraySeq[Boolean]) = {
      val list = ArraySeq.fill[Boolean](size)(true)   // Using an array of booleans. True = is prime, False = not a prime

      // seed data
      list(0) = false
      list(1) = false
      list(2) = true // 2 is a prime

      var p: Int = 2
      var sum: Long = 0

      while (p < size) {
        if (list(p) == false) { // p is not prime
          //do nothing
        } else { // p is prime
          // increase sum
          sum = sum + p
          // remove all multiples of p from the list.
          for {
            i <- (p * 2 to (size - 1)) by p
          } {
            list(i) = false
          }
        }
        p = p + 1
      }
      (sum, list) // returning a tuple2
    }

    val until2millions = findPrimesAndSum(2000000)

    println(until2millions._1) // 142913828922 OK
  }
}
