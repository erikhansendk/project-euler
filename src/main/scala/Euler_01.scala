object Euler_01 {
  def main(args: Array[String]): Unit = {
    // https://projecteuler.net/problem=1

    val multOf3Or5 = (1 to 999).toList.filter(x => x % 3 == 0 ||  x % 5 == 0)
    val res = multOf3Or5.sum

    println ( res )  // 233168

  }
}
