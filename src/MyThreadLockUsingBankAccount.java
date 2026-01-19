public class MyThreadLockUsingBankAccount {
    public static  void main(String[] args)
    {
        BankAccount bankAccount=new BankAccount();
        Runnable task =new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(500);
            }
        };
        Thread t1=new Thread(task, "thread 1");
        Thread t2 =new Thread(task, "thread 2");
        t1.start();
        t2.start();
    }
}
