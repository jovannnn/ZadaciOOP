package com.company;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        Map<String,String>recnik=new HashMap<String,String>();
        recnik.put("hi","zdravo");
        recnik.put("how ar u","kako si");
        recnik.put("where are you from","od kade si");
        recnik.put("dog","kuce");
        recnik.put("cat","mace");
        System.out.println("Klucevite se:"+" "+recnik.keySet());
        System.out.println("Vrednostite se:"+" "+recnik.values());
        System.out.println("Klucevi i vrednosti:"+" "+recnik.keySet()+" "+recnik.values());
    }
}
