object Twelve{
  def main(args:Array[String]){
    var max: Long = 0;
    var n: Int = 1;
    while(max<500){
      val divisors = numDivisors((n*(n+1))/2);
      max = math.max(max, divisors);
      println("n = " + n + " divisors = " + divisors + " and max = " + max);
      n += 1;
    }
    println(n*(n-1)/2);
  }
  def numDivisors(triNum: Long): Int = {
    var counter: Int = 0;
    for(i <- 1L to math.sqrt(triNum.toDouble).toInt){
      if(triNum%i==0){counter+=1;}
    }
    counter*2;
  }
}
