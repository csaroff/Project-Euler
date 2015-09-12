public class Main {
    public static void main(String[] args) {
        final int WIDTH = 1001;
        int skip = 2;
        int current = 1;
        int total = current;

        while(skip < WIDTH) {
            for(int i=0; i<4; i++) {
                current += skip;
                total += current;
            }
            skip += 2;
        }

        System.out.println(total);
    }
}
