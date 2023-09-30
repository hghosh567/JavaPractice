package Thread_practice;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
