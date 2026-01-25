import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ContDownLatch {

    public  static  void main(String[] args) throws InterruptedException {
        int n=3;
        ExecutorService executorService= Executors.newFixedThreadPool(n);
        CountDownLatch latch=new CountDownLatch(n);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();
        System.out.println("Main");
        executorService.shutdown();
    }

}
