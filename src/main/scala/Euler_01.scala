object Euler_01 {
  def main(args: Array[String]): Unit = {

    // https://projecteuler.net/problem=1

    val res = (1 until 1000).filter(x => x % 3 == 0 ||  x % 5 == 0).sum

    println ( res )  // 233168
  }
}
