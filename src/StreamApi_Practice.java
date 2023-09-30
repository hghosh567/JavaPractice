import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi_Practice {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        List<Integer> copy;

        copy = arr.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(copy);
        copy.stream().sorted().map(i->i*2).forEach(System.out::println);

        //-----> also learn anymatch function

        //below returns only single integer thus using get function

        Integer a = copy.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println(a);


    }
}
