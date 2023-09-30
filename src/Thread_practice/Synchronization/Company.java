package Thread_practice.Synchronization;

public class Company {

    int n;
    boolean produce = true;
    synchronized public void produceItem(int n) {
        if(!produce)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        System.out.println("Produced = "+this.n);
        produce=false;
        notify();
    }

    synchronized public void consumeItem(){
        if(produce)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed = "+this.n);
        produce = true;
        notify();
    }
}
