public class Six{
    public static void main(String[] args){
        long sumOfSquares=0;
        long sum=0;
        for(int i=0; i<=100; i++){
            sumOfSquares+=i*i;
            sum+=i;
        }
        System.out.println((sum*sum)-(sumOfSquares));
    }
}
