package Thread_practice;

//there is an interface called runnable with run method
//there is a class called thread that implements runnable and has a start() method;

// you can either implement runnable in your class,override run method and create a object of the class
//then pass that object into another object of thread class and start it. Example given below

// second method is directly extend thread class and start the thread

// the first method is more preferable because you cannot extend thread class more which may result in multiple inheritance problem


import java.util.Arrays;

public class Thread_Practice implements Runnable{
    @Override
    public void run() {
        //System.out.println(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread_Practice thread_practice = new Thread_Practice();
        Thread thread = new Thread(thread_practice);
        thread.start();

        System.out.println(Thread.currentThread().getName());
        //used to name any thread - Thread.currentThread().setName("Main thread");

        //see below two threads will run together
        //setPriority method can be used on various thread objects to execute them in order you want

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
    }
}
