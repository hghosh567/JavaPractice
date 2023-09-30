import java.util.*;

public class Map_practice {
    public static void main(String[] args) {
        //Map<Integer,Integer> mp= new HashMap<>();
        //Map<Integer,Integer> mp = new LinkedHashMap<>();
        Map<Integer,Integer> mp = new TreeMap<>();//stores in order
        mp.put(1,2);
        mp.put(2,3);
        mp.putIfAbsent(2,5);
        mp.containsKey(4);
        mp.remove(1);
        for(Integer i:mp.keySet())
        {
            System.out.println(i +","+mp.get(i));
        }
        for(Map.Entry<Integer,Integer> it : mp.entrySet())
        {
            System.out.println(it.getKey()+","+it.getValue());
        }
    }
}
