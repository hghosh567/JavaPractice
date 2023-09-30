import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        //Collections.sort(arr);
        //Collections.sort(arr, Comparator.reverseOrder());
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return (b-a)>0?1:-1;
                // here return 1 when you want the order to stay just as the condition, return 0
                //when you want to retain the order and -1 when you want to reverse the order to condn;
            }
        };
        Collections.sort(arr,comparator);
        System.out.println(arr);
        System.out.println(Collections.max(arr));
    }
}
