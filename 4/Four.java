public class Four{
    public static void main(String[] args){
        int largestNum = 0;
        int a=0;
        int b=0;
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                //for(int k=0; k<100; k++){
                    if(isPalindrome(i*j)&&(i*j>largestNum)){
                        largestNum= i*j;
                        a=i;
                        b=j;
                    }
                //}
            }
        }
        System.out.println("The largest number = " + a + "*" + b + "=" + largestNum);
    }
    public static boolean isPalindrome(int arg){
        String pal = "" + arg;
        for(int i=0; i<pal.length()/2; i++){
            if(pal.charAt(i)!=pal.charAt(pal.length()-1-i))
                return false;
        }
        return true;
    }
}
