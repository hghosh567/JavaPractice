package Thread_practice.Synchronization;

public class Producer extends Thread{

    Company c;
    Producer(Company c)
    {
        this.c=c;
    }

    @Override
    public void run() {
        int i=1;
        while (i<=10)
        {
            this.c.produceItem(i);
            try{Thread.sleep(2000);}catch(Exception e){}
            i++;

        }
    }
}
