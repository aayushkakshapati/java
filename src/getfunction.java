public class getfunction {
    String s=null;
    public void setname(String s ){ //vitra vako variable lai pathako paramter ma  set gardincha
       this.s=s; // object bina variable lai call gardincha .AKA pointer.

    }
    public String getname(){ // set vako variable lai return gardincha
        return this.s;
    }
    public static void main(String[] arg){
        getfunction g1= new getfunction();
        g1.setname("aayush"); // setfunction ma aayush string pathako ho
        System.out.println(g1.getname());

    }
}