package com.company;

public class Main {

    public static void main(String[] args) {
	Restoran n=new Restoran();
    n.setIme("Drim");
    n.setLokacija("Struga");
    n.setTelefon(13947913);
    n.setSedista(300);
    System.out.println("Ime:"+n.getIme());
        System.out.println("Lokacija:"+n.getLokacija());
        System.out.println("Telefon:"+n.getTelefon());
        System.out.println("Sedista:"+n.getSedista());
    }
}
