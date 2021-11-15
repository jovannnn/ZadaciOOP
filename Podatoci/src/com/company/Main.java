package com.company;

public class Main {

    public static void main(String[] args) {
	Podatoci n=new Podatoci();
    n.setIme("Stefan");
    n.setPrezime("Stefanovski");
    n.setIndeks(9999);
    System.out.println("Ime:"+n.getIme());
        System.out.println("PrezIme:"+n.getPrezime());
        System.out.println("Indeks:"+n.getIndeks());
    }
}
