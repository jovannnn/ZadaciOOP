package com.company;

public class Avtomobil {
    public String marka;
    public String model;
    public int pomKm;
    public String boja;

    public Avtomobil(String marka,String model,String boja,int pomKm){
        this.marka=marka;
        this.model=model;
        this.pomKm=pomKm;
        this.boja=boja;
    }
    public int  PrvMetod(int pomnoziKm){
     System.out.println("Pomnozeni km:"+(this.pomKm*pomnoziKm));
     return pomnoziKm;
    }
}
