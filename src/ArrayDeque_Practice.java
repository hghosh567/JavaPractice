import java.util.ArrayDeque;

public class ArrayDeque_Practice {
    public static void main(String[] args) {
        ArrayDeque<Integer> ar = new ArrayDeque<>();
        ar.add(1);
        ar.offerFirst(2);
        ar.offerLast(3);

        ar.peekFirst();
        ar.peekLast();

        ar.pollFirst();
        ar.pollLast();
    }
}
