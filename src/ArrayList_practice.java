import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayList_practice
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        for (int i=100;i<=200;i++)
        {
            l.add(i);
        }
        for(Integer i: l)
        {
            System.out.println(i);
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }

        l.remove(Integer.valueOf(101));
        System.out.println(l);
        System.out.println(l.contains(Integer.valueOf(100)));

        List<Integer> n = new ArrayList<>();
        n.addAll(l);

    }
}
