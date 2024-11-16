package com.arrays;

import java.util.*;

public class Sorting {

    public static List<Integer> sorthingWithTreeMap (int[] arr){
        Map<Integer,List> map = new TreeMap<>();
        for(int num:arr){
            if(!map.containsKey(num)){
                map.put(num,new ArrayList<>(Arrays.asList(num)));
                System.out.println("Added new list: " + map.get(num));
            }else{
                List<Integer> temp = map.get(num);
                temp.add(num);
                map.put(num, temp);
                System.out.println("Updated list: " + temp);

            }
        }
        System.out.println(map.values());

        List<Integer> flattenedList = new ArrayList<>();
        for (List<Integer> innerList : map.values()) {
            flattenedList.addAll(innerList);
        }
        System.out.println(flattenedList);
        return null;
    }
}
