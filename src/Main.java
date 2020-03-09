public class Main {
    public static void main(String[] args){
      //  Task2 task=new Task2();// its not recommended


        Task task=new Task();//recommended
        Thread thread=new Thread(task); //worker
        thread.start();
        System.out.println("Inside main thread");
    }
}
