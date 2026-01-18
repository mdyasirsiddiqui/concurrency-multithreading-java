public class ThreadOperation {

    public  static  void main(String[] args)
    {
        System.out.println("Started");
        int x= 54+98;
        System.out.println(" Sum is "+x);

        Thread t= Thread.currentThread();
        t.setName("yasir");
        String tname=t.getName();

        System.out.println("current thread is "+tname);

        UserThread thread =new UserThread();
        thread.start();

        System.out.println("ended");
    }
}
