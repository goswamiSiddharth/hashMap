import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("USA",120);
        map.put("China",150);
        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("present");
        }else{
            System.out.println("Not present");
        }

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys= map.keySet();
        for(String i:keys){
            System.out.println(i+" "+map.get(i));
        }
    }
}
