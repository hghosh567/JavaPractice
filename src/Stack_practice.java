import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack_practice {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
       for(Integer i=1;i<=5;i++)
       {
           s.push(i);
       }
       System.out.println(s.peek());
       System.out.println(s.pop());
        while (!s.empty())
        {
            System.out.println(s.pop());
        }
    }
}
