object Eleven{
  def main(args:Array[String]){
    val source = scala.io.Source.fromFile("input.txt");
    var mat: Array[Array[Int]] = new Array[Array[Int]](20);
    var count : Int = 0;
    for (line <- source.getLines()) {
      mat(count) = new Array[Int](0);
      for(number <- line.split(" ").map(_.toInt)){
        mat(count) = mat(count) :+ number;
      }
      count+=1;
    }

    var greatest: Int = 0;
    for(i <- 0 until 20){
      for(j <- 0 until 20){
        greatest = math.max(greatest, checkPoint(mat, i, j));
      }
    }
    println(greatest);

		source.close();
  }
  def checkPoint(matrix:Array[Array[Int]], i: Int, j: Int):Int = {
    List(checkDown(matrix, i, j),checkRight(matrix, i, j),checkDownRight(matrix, i, j),checkDownLeft(matrix, i, j)).reduceLeft(math.max);
  }
  def checkDown(matrix:Array[Array[Int]], i: Int, j: Int):Int = {
    var mult : Int = 1;
    if(i+3<20){
      for(x<-0 until 4){
        mult *= matrix(i+x)(j)
      }
    }
    mult;
  }
  def checkRight(matrix:Array[Array[Int]], i: Int, j: Int):Int = {
    var mult : Int = 1;
    if(j+3<20){
      for(x <- 0 until 4){
        mult *= matrix(i)(j+x) 
      }
    }
    mult;
  }
  def checkDownRight(matrix:Array[Array[Int]], i: Int, j: Int):Int = {
    var mult : Int = 1;
    if(i+3<20 && j+3<20){
      for(x <- 0 until 4){
        mult *= matrix(i+x)(j+x);
      }
    }
    mult;
  }
  def checkDownLeft(matrix:Array[Array[Int]], i: Int, j: Int):Int = {
    var mult : Int = 1;
    if(i+3<20 && j-3>=0){
      for(x<- 0 until 4){
        mult*= matrix(i+x)(j-x);
      }
    }
    mult;
  }
}
