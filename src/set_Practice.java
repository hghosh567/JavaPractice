import java.util.*;

public class set_Practice {
    public static void main(String[] args) {
        //Set<Integer> s = new HashSet<>();
        //Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> s = new TreeSet<>(Comparator.reverseOrder());
        s.add(1);
        s.add(6);
        s.add(5);
        s.add(4);
        Iterator<Integer> it = s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
