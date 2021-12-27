package com.company;
import java.io.IOException;
public class Main {

    public static void main(String[] args)throws IOException {
        Datoteka d=new Datoteka("file.txt");
        d.zapishi("Ova e tekstot");
        d.prochitaj();

    }
}
