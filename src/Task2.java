public class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Inside run");
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
