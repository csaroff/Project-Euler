public class Seven{
    public static final int NUMBER_OF_PRIMES = 100000;
    public static int[] primes = new int[NUMBER_OF_PRIMES+1];
    public static int nextPrime=0;
    public static void main(String[] args){
        for(int i=2; nextPrime<NUMBER_OF_PRIMES+1; i++){
            if(isPrime(i)){
                primes[nextPrime++]=i;
            }
        }
        System.out.println(primes[NUMBER_OF_PRIMES]);
    }
    public static boolean isPrime(int x){
        for(int i=0; i<nextPrime; i++){
            //System.out.println("i = " + i);
            //System.out.println("the i'th prime is: " + primes[i]);
            //System.out.println("the i+1'th prime is: " + primes[i+1]);
            if(x%primes[i]==0)
                return false;
        }
        return true;
    }
}

