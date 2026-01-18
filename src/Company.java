public class Company  {
    int n;
    boolean flag=true; /// true for consumer and false for producer

    synchronized  public  void produce_item(int n) throws  InterruptedException
    {
        if(flag)
        {
            wait();
        }
        this.n=n;
        System.out.println("Producer produced item "+this.n);
        flag=true;
    }

    synchronized public  void consume_item(int n) throws InterruptedException
    {
        if(!flag)
        {
            wait();
        }
        this.n=n;
        System.out.println("Consumer consumed item "+this.n);
        flag=false;
        notify();

    }

}
