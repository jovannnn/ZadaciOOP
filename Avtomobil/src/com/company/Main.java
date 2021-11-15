package com.company;

public class Main {

    public static void main(String[] args) {
	Avtomobil n=new Avtomobil("Wolsvagen","Golf 7","Sina",7120);
    System.out.println("Marka:"+n.marka);
        System.out.println("Model:"+n.model);
        System.out.println("Boja:"+n.boja);
        System.out.println("pomKm:"+n.pomKm);
        n.PrvMetod(64);
    }
}
