import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_practice {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.add(1);
        p.add(2);
        p.add(8);
        p.add(3);
        p.poll();
        System.out.println(p.peek());
    }
}
