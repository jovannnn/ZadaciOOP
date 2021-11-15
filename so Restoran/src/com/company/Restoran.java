package com.company;

public class Restoran {
    public String ime;
    public String lokacija;
    public int telefon;
    public int sedista;

    public Restoran(){

    }
    public String getIme(){
        return ime;
    }
    public String getLokacija(){
        return lokacija;
    }
    public int getTelefon(){
        return telefon;
    }
    public int getSedista(){
        return sedista;
    }
    public void setIme(String Ime){
        this.ime=ime;
    }
    public void setLokacija(String prezime){
        this.lokacija=prezime;
    }
    public void setTelefon(int telefon){
        this.telefon=telefon;
    }
    public void setSedista(int sedista){
        this.sedista=sedista;
    }
}
