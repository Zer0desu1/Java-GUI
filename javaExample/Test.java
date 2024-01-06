public class Test {
    
    public static void main(String[] args) {
        SharedBuffer sb=new SharedBuffer();
        Producer p=new Producer(sb);
        Consumer c=new Consumer(sb);
        p.start();
        c.start();
    }
}
