object Euler_06 {
  def main(args: Array[String]): Unit = {


    /**
      * The sum of the squares of the first ten natural numbers is,
      * 1^2 + 2^2 + ... + 10^2 = 385
      *
      * The square of the sum of the first ten natural numbers is,
      * (1 + 2 + ... + 10)^2 = 55^2 = 3025
      *
      * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
      *
      * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
      */


    def sumOfTheSquaresUpTo(x: Int): Int = {
      var res = 0
      for(i <- 1 to x){
        res = res + (i * i)
      }
      res
    }

    def squareOfTheSumUpTo(x: Int): Int = {
      val summ = (1 to x).sum
      summ * summ
    }

    def differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(x: Int) : Int = {
      squareOfTheSumUpTo(x) - sumOfTheSquaresUpTo(x)
    }

    println(differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(100)) // 25164150 OK


    // testing
    assert (sumOfTheSquaresUpTo(10) == 385)
    assert (squareOfTheSumUpTo(10) == 3025)
    assert (differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(10) == 2640)
  }
}
