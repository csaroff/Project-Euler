import java.util.HashMap;
public class Five{
    public static int MAX = 20;
    public static void main(String[] args){
        HashMap<Integer, Integer> primeFactors = new HashMap<Integer, Integer>();
        for(int i=1; i<=MAX; i++){primeFactors.put(i,0);}
        for(int i=2; i<=MAX; i++){
            HashMap<Integer, Integer> miniPF = getPrimeFactors(i);
            for(Integer p : miniPF.keySet()){
                if(miniPF.get(p)>primeFactors.get(p)){
                    primeFactors.put(p, miniPF.get(p));
                }
            }
        }
        int result = 1;
        for(Integer i : primeFactors.keySet()){
            for(int j=0; j<primeFactors.get(i); j++){
                System.out.println(i);
                result*=i;
            }
        }
        System.out.println(result);
    }
    public static HashMap<Integer, Integer> getPrimeFactors(int top){
        HashMap<Integer, Integer> primeFactors = new HashMap<Integer, Integer>();
        assert top > 1;
        for(int i=2; i<=top; i++){
            while(top%i==0){
                if(primeFactors.get(i)==null)
                    primeFactors.put(i, 1);
                else
                    primeFactors.put(i, primeFactors.get(i)+1);
                top/=i;
            }
        }
        return primeFactors;
    }
}
