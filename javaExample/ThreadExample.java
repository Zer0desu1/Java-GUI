public class ThreadExample extends Thread {
    private String name;
    private int time;

    public ThreadExample(String name) {
        this.name = name;
        this.time = 0;
    }

    public void run() {
        while (true) {  // Add a loop to keep the threads running continuously
            System.out.println(name + " " + time);

            if (name.equals("first")) {
                time += 1;
            } else if (name.equals("Second")) {
                time += 10;
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample("first");
        ThreadExample t2 = new ThreadExample("Second");
        t1.start();
        t2.start();
    }
}
