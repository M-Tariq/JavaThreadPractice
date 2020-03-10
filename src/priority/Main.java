package priority;
class Main{
    public static void main(String[] args){

        Thread emailCampaignThread=new Thread(new EmailCompaign());
        Thread dataAggregatorThread=new Thread(new DataAggregator());

        emailCampaignThread.setName("EmailCampaign");
        dataAggregatorThread.setName("DataAggregator");

        emailCampaignThread.setPriority(Thread.MIN_PRIORITY); //higher priority
        dataAggregatorThread.setPriority(Thread.MAX_PRIORITY);

        dataAggregatorThread.start();
        emailCampaignThread.start();
       try {
           dataAggregatorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Inside main.....");
    }
}