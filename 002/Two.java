public class Two {
    public static void main(String[] args){
        int total = 0;
        int old=1;
        int older=1;
        while(total<4000000){
            int tmp=old+older;
            older=old;
            old=tmp;
            if(tmp%2==0)
                total+=tmp;
        }
        System.out.println(total);
    }
}
