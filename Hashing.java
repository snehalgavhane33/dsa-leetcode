import java.util.*;
 

/* 
public class Hashing {
    public static void main(String[] args){
        //creating
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // //search-contains
        // if(set.contains(1)){
        //     System.out.println("Set contains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("Does not contain");
        // }

        // //Delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("Does not contain 1");
        // }

        //size
        System.out.println("Size of set is: " + set.size());

        //Print all elements 
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        //hasnext check if next element present or not . next() print next element
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}*/

public class Hashing {

    public static void main(String[] args) {
        HashMap <String , Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("US",30);
        map.put("China", 150);
        System.out.println(map);

    //     map.put("China", 180);
    //     System.out.println(map);

    //     if(map.containsKey("China")){
    //         System.out.println("Key is present in the map");
    //     }
    //     else{
    //         System.out.println("Key is not present in the map");
    //     }

    //     System.out.println(map.get("China"));
    //     System.out.println(map.get("Indonesia"));
    

    // int arr[] = {11,12,13};
    // for(int i=0;i<3;i++){
    //     System.out.print(arr[i] + " ");

    // }
    // System.out.println();

    // for(int val : arr){
    //     System.out.print(val + " ");
    // }

    // for(Map.Entry<String,Integer> e : map.entrySet()){
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    // }

    // Set<String> Keys = map.keySet();
    // for(String key: Keys){
    //     System.out.println(key+ " " + map.get(key));
    // }

    map.remove("China");
    System.out.println(map);
        
        
    }
}