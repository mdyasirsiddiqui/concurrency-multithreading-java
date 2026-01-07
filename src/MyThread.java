//Creating thread using Runnable
public class MyThread implements Runnable{


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
        MyThread t= new MyThread();
        Thread thread= new Thread(t);
        thread.start();
    }
}
