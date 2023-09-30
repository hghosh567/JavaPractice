import java.util.*;

public class JavaPractice {
    public static void main(String[] args)
    {
        // also remember some string methods
       car c = new car(2,3);
       c.a=10;
       c.print();
       System.out.println(4);
       car.printer();

       Animal a = new Giraffe();
       a.eat();

       Rectangle r = new Rectangle();
       r.draw();
       int arr[] = {1,2,3};
       int copyArr[] = arr.clone();
       for(int i=0;i<copyArr.length;i++)
       {
           System.out.println(copyArr[i]);
       }
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(5);
       list.add(6);
       list.add(0,100);
       for(int i:list)
       {
           System.out.println(i);
       }
       System.out.println(list);
    }
}
class car{
    int a ;
    int b ;

    car(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    static int d =15;
    public void print()
    {
        System.out.println(d);
    }
    public static void printer()
    {
        System.out.println(98);
    }
}

class Animal{
    int nooflegs = 4;
    void eat()
    {
        System.out.println("Eating things in nature");
    }
}

class Giraffe extends Animal{
    void eat()
    {
        super.eat();
        super.nooflegs = 8;
        System.out.println("It has "+nooflegs+" of legs.");
    }
}

interface drawable{
    void draw();
}
class Rectangle implements drawable{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}