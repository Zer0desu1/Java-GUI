public class Exception1 {
    
    public int m(){
        try {
            int x=4;
            int y=0;
            return x/y;

        } catch (Exception e) {
            System.out.println("in catch");
        }
        return -1;
    }
    public int n(){
        int x=4;
        int y=0;
        return x/y;
    }
    public static void main(String[] args) {
        Exception1 en=new Exception1();


            System.out.println(en.m());

     
        
        System.out.println("end");
    }
}
