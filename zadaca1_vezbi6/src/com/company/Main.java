package com.company;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	List<String >footballClubs=new ArrayList<String>();
    footballClubs.add("AC Milan");
    footballClubs.add("Real Madrid");
    footballClubs.add("Liverpool");
    footballClubs.remove(1);
    System.out.println("Listata so odstrnet element"+" "+footballClubs);
    System.out.println("Goleminata na listata e"+" "+footballClubs.size());
    }
}
