public class MyThreadCounterSynchronized extends Thread {

    private Counter counter;
    public MyThreadCounterSynchronized(Counter counter)
    {
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i=0;i<=1000;i++)
        {
            counter.incrementCounter();
        }
    }

    public static void main(String[] args) {
        Counter counter1=new Counter();
        MyThreadCounterSynchronized t1=new MyThreadCounterSynchronized(counter1);
        MyThreadCounterSynchronized t2=new MyThreadCounterSynchronized(counter1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter1.getCount());

    }
}