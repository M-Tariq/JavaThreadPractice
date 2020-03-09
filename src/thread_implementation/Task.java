package thread_implementation;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside task1 run");
        go();
    }
    public void go(){
        System.out.println("Inside go");
        more();
    }
    public void more(){
        System.out.println("Inside more");
    }

}
