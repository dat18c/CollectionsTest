package com.kea.Collections;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(13);
        l.add(1);
        l.add(3);
        l.add(13);
        System.out.println(l);
        sortAndRemoveDuplicates(l);
        System.out.println(l);

    }
    public static void sortAndRemoveDuplicates(List<Integer> list){
        Set<Integer> set = new TreeSet<Integer>(list);
        list.clear();
        for (Integer i: set){
            list.add(i);
        }
    }
}
