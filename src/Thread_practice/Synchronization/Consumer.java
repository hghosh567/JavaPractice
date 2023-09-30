package Thread_practice.Synchronization;

public class Consumer extends Thread{

    Company c;

    Consumer(Company c)
    {
        this.c=c;
    }

    @Override
    public void run() {
        while(true){
        this.c.consumeItem();
        if(c.n==10)
        {
            break;
        }
        try{Thread.sleep(2000);}catch(Exception e){}}

    }
}
