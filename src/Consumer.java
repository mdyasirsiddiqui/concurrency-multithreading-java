public class Consumer extends Thread{
    Company c;
   public Consumer(Company c)
    {
        this.c=c;
    }
    public void  run(){

       int i=0;
       while(true)
       {
          try{ c.consume_item(i);
           Thread.sleep(2000);}
          catch(Exception e){
              System.err.println("Consumer produced exception "+ e.getMessage());
          }
           i++;
       }
    }
}
