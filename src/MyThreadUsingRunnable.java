//Creating thread using Runnable
public class MyThreadUsingRunnable implements Runnable{


    @Override
    public void run() {
        for(int i =0;i<10;i++) {
            System.out.println("value of i is " + i);
            try{
                Thread.sleep(1000);
            }catch (Exception e)
            {}
        }
    }
    public static  void main(String[] args)
    {
        MyThreadUsingRunnable t= new MyThreadUsingRunnable();
        Thread threadRunnable= new Thread(t);
        MyThreadUsingThreadClass myThreadUsingThreadClass=new MyThreadUsingThreadClass();
        threadRunnable.start();
        myThreadUsingThreadClass.start();
    }
}
