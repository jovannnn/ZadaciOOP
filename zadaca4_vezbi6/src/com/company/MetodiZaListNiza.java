package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MetodiZaListNiza {
    public void listToArray(List<String>lista){
        String[] niza=new String[lista.size()];
        lista.toArray(niza);
        System.out.println("Lista vo niza");
        for(String st:niza){
            System.out.println(st);
        }
    }
    public void arraytoList(String[]niza){
        List<String>lista=new ArrayList<String>();
        lista=Arrays.asList(niza);
        System.out.println("Niza vo lista");
        for(String st:lista){
            System.out.println(st);
        }
    }
}
