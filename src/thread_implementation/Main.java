package thread_implementation;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
      Task2 task2=new Task2();// its not recommended


        Task task=new Task();//recommended
        Thread thread=new Thread(task); //worker
        Thread thread2=new Thread(task2); //worker
        thread.start();
        thread2.start();
        //Thread.sleep(3000);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside main thread");
    }
}
