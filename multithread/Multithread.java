package multithread;
public class Multithread extends Thread {
    Multithread(String name)
    {
        System.out.println(name);
    }
    @Override
      public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println( "Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
        try {
                Thread.sleep(100);
                System.out.println("Thraed is Sleeping");
            }
            catch (InterruptedException e) {
                System.out.println("Caught:" + e);
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Multithread t1=new Multithread("My thread");
        Multithread t2=new Multithread("My thread");
       t1.start();// to start the  thread 
       t1.getName(); // to get the name of thead
        try {
            Multithread.sleep(1000);
        } catch (InterruptedException ex) {
          System.out.println("Exception oocurs");
        }
        t2.start();
        System.out.println("I am here");
    }
    
}
