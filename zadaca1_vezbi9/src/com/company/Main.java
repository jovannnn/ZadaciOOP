package com.company;

public class Main {

    public static void main(String[] args) {
	Vraboten vraboten = new Vraboten();
    vraboten.setIme("Stefan");
    vraboten.setPrezime("Stefanovski");
    vraboten.setPlata("10000");

        Vraboteni vraboteni = new Vraboteni();
        vraboteni.setIme("Aleksandar");
        vraboteni.setPrezime("Ristevski");
        vraboteni.setPlata("15000");

    XML xml=new XML();
    xml.createXMLFile("xml",vraboten);
    }
}
