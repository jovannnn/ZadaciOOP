package com.company;

public class Main {

    public static void main(String[] args) {
	int x=14;
    int y=9;
    KalkulatorZaDecimalniBroevi n=new KalkulatorZaDecimalniBroevi();
    System.out.println("Odzemanje:"+" "+n.odzemanje(x,y));
        System.out.println("Sobiranje:"+" "+n.sobiranje(x,y));
        System.out.println("Mnozenje:"+" "+n.mnozenja(x,y));
        System.out.println("Delenje:"+" "+n.delenje(x,y));
        System.out.println("Ostatok:"+" "+n.ostatok(x,y));
        System.out.println("Stepenuvanje:"+" "+n.stepenuvanje(x,y));
    }
}
