object Euler_09 {
  def main(args: Array[String]): Unit = {
    /**
      * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
      * a2 + b2 = c2
      * For example, 32 + 42 = 9 + 16 = 25 = 52.
      * *
      * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
      * Find the product abc.
      */

    val results = for {
      a <- (1 to 333)   // because a < b < c,  a+(a+x)+(a+y) = 1000, 3a <= 1000, a <= 333
      b <- (a to 500)   // because a < b < c, a+b+b = 1000, 2b <= 1000, b <= 500
      c <- (b to 1000)  // because a < b < c
      if (a + b + c == 1000) // condition: sum is 1000
      if (a * a + b * b == c * c) // condition: is Pythagorean Triplet
    } yield (a, b, c)

    val triplet = results.head
    val productAbc = triplet._1 * triplet._2 * triplet._3

    println(productAbc) // 31875000 OK

  }
}
