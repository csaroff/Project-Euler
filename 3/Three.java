public class Three{
    public static void main(String[] args){
        long start=600851475143l;
        for(int i=2; i<775146; i++){
            while(start%i==0){
                start=start/i;
                System.out.println(start);
                if(start==1)
                    System.out.println("Answer: " + i);
            }
        }
    }
}
