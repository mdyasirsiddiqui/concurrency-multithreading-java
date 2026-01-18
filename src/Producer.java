public class Producer extends Thread {

    Company c;
    public Producer(Company c)
    {
        this.c=c;
    }
    public void  run()
     {
         int i=0;
         while(true) {
            try{ c.produce_item(i);
             Thread.sleep(1000);}
            catch(InterruptedException e){
                System.err.println("Producer interuppted exception "+e.getMessage());
            }
             i++;
         }
     }

}
