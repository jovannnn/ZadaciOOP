package com.company;

public class Podatoci {
    public String ime;
    public String prezime;
    public int indeks;

    public Podatoci(){

    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public int getIndeks(){
        return indeks;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public void setIndeks(int godini)
    {this.indeks=godini;}
}
