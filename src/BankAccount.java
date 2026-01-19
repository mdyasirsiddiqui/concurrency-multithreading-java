import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance=1000;

    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount)
    {

        System.out.println(Thread.currentThread().getName()+" attempting to withdraw money");
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
            {
                if(balance>=amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+" attempting to withdrawl");
                        Thread.sleep(3000);
                        balance -=amount;
                        System.out.println(Thread.currentThread().getName()+" withdrawl sucessfull, balance after withdrawl is "+balance);
                    }catch (InterruptedException e)
                    {
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println("insufficiant balance ");
                }
            }else {
                System.out.println(Thread.currentThread().getName()+" Could not acquire the lock, will try later");
            }
        }catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

    }

}
