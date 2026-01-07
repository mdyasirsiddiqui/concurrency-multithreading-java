public class MyThreadUsingThreadClass extends Thread {
    @Override
    public  void run()
    {
        for(int i=10;i>0;i--)
        {
            System.out.println("value of i is "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
        MyThreadUsingThreadClass threadByThreadClass= new MyThreadUsingThreadClass();
        threadByThreadClass.start();
    }


}
