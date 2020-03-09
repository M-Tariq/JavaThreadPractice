package thread_priority;

public class EmailCompaign implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside EmailCampaign run");
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
            if(i==5){
                System.out.println("yield");
                Thread.currentThread().yield();
            }
        }
    }
}
class DataAggregator implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside DataAggregator run");
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

