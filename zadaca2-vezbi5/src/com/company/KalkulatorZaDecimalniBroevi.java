package com.company;

public class KalkulatorZaDecimalniBroevi implements IMatematickiOperaciiVrzDecimalniBroevi {
    @Override
    public double odzemanje(double x, double y) {
        double odzemanje;
        odzemanje=x-y;
        return odzemanje;
    }

    @Override
    public double sobiranje(double x, double y) {
        double sobiranje;
        sobiranje=x+y;
        return sobiranje;
    }

    @Override
    public double mnozenja(double x, double y) {
        double mnozenje;
        mnozenje=x*y;
        return mnozenje;
    }

    @Override
    public double delenje(double x, double y) {
        double delenje;
        delenje=x/y;
        return delenje;
    }

    @Override
    public double ostatok(double x, double y) {
        double ostatok;
        ostatok=x%y;
        return ostatok;
    }

    @Override
    public double stepenuvanje(double x, double y) {
        double stepenuvanje;
        stepenuvanje=(long)Math.pow(x,y);
        return stepenuvanje;
    }
}
