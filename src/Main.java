public class Main {
    public static void main(String[] args){
        Task task=new Task();
        Thread thread=new Thread(task); //work
        thread.start(); //worker
        System.out.println("Inside main thread");
    }
}
