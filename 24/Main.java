import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Please enter the number of permutations.");
        System.out.println(lexPerm(new ArrayList<String>(Arrays.asList(args)), Integer.parseInt(new Scanner(System.in).next())-1));
    }

    /**
     * Retrieves the numth permutation of elements according to their
     * lexigraphic ordering.
     **/
    public static String lexPerm(ArrayList<String> elements, int num) {
        // Ensure that the array is sorted
        Collections.sort(elements);
        String result = "";
        while(elements.size() > 0) {
            result += elements.remove(num/factorial(elements.size()-1));
            if(elements.size() == 0) break;
            num = num % factorial(elements.size());
        }
        return result;
    }
    public static int factorial(int n) {
        return n > 1 ? n*factorial(n-1) : 1;
    }
}
