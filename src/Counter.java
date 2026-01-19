public class Counter {

    private  int counter =0;

    public synchronized void incrementCounter( )
    {
        counter++;
    }

    public  int getCount()
    {
        return counter;
    }
}
