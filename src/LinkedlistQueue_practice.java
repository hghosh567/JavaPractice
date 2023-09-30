import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistQueue_practice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.peek();
        queue.poll();
    }
}
