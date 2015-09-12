public class Nine{
    public static final int SUM = 1000;
    public static void main(String[] args){
        for(int i=1; i<SUM; i++){
            for(int j=1; j<SUM; j++){
                for(int k=1; k<SUM; k++){
                    if(i+j+k==SUM){
                        if(i*i+j*j==k*k){
                            //System.out.println("a= " + i + ", b= " + j + ", k= " + k);
                            System.out.println("a*b*c= " + i*j*k);
                        }
                    }
                }
            }
        }
    }
}
