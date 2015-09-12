import java.math.*;
public class Main{
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci() {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        int index = 2;
        while(first.toString().length() < 1000) {
            BigInteger temp = first.add(second);
            second = first;
            first = temp;
            index++;
        }
        System.out.println(index);
    }
}
