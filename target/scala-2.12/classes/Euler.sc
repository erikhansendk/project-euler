

//The prime factors of 13195 are 5, 7, 13 and 29.
/*
 * In order to brute force the problem, we need to use a small trick.
 * Any factor less than the square root of the number we check,
 * will have corresponding factor larger than the square root of the number.
 * So we only need to check up to the square root of the number,
 * and then we can deduct the remaining factors.
 */

def getSmallFactors(i: Long): Set[Long] = {
  val stop  = i / 2  // sqrt(i) is better
  var p = 1
  var res = Set[Long](1,i)
  while(p < stop){
    if (i % p == 0) res = res + p
    p = p+2
  }
  res
}

def isPrime(i: Long): Boolean = getSmallFactors(i) == Set(i,1) && (i > 1)


def getPrimeFactors(i: Long): Set[Long] = getSmallFactors(i).filter(isPrime)




getSmallFactors(13195)
isPrime(13195)
getPrimeFactors(13195)



val 6mia = 6000000000L

scala.math.s

