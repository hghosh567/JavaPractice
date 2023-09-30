package Thread_practice.Synchronization;

public class MainClass {

    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        //Notice above how the same object of company is passed on to the other objects.
        //If different objects of company were created in both producer and consumer class then it would not work
        p.start();
        c.start();
    }
}
