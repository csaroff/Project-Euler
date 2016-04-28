import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger count = BigInteger.ZERO;
        for(int i = 1; i <= 1000; i++) {
            count = count.add(new BigInteger(i + "").pow(i));
        }
        System.out.println("count = " + count);
    }
}
