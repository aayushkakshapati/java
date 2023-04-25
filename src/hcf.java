public class hcf {
    public static int findhcf(int a,int b){
        if(b==0){
            return a;
        } else {
            return findhcf(b,a%b);
        }
    }
    public static void main(String[] args) {


    }
}
