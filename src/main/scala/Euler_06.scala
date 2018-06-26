object Euler_06 {
  def main(args: Array[String]): Unit = {

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

    println(differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(100)) // 25164150

    // test
    assert (sumOfTheSquaresUpTo(10) == 385)
    assert (squareOfTheSumUpTo(10) == 3025)
    assert (differenceBetweenTheSumOfTheSquaresAndTheSquareOfTheSum(10) == 2640)
  }
}
