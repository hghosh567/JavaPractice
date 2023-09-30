import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_practice {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(4);
        l.add(5);

        Iterator<Integer> i = l.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }



    }
}
