package com.company;

public class Main {

    public static void main(String[] args) {
	Covek n=new Covek();
    n.setIme("Jovan");
    n.setPrezime("Belkoski");
    n.setMatBroj(23872379);
    System.out.println("Ime:"+n.getIme());
        System.out.println("Prezime:"+n.getPrezime());
        System.out.println("Maticen broj:"+n.getMaticenBroj());
    }
}
