public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i<100000000; i++) {
            if(i%10 == 0)
                continue;
            if(isEntirelyOdd(i + reverse(i))){
                //System.out.println(i+reverse(i));
                count++;
            }
            //System.out.println("i = " + i);
        }
        System.out.println("count = " + count);
    }
    public static int reverse(int input) {
        int reversedNum = 0;
        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input = input / 10;
        }
        return reversedNum;
    }
    public static boolean isEntirelyOdd(int input) {
        while(input != 0) {
            int element = input % 10;
            if(element % 2 == 0)
                return false;
            input = input / 10;
        }
        return true;
    }
}
