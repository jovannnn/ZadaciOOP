package com.company;

public class KalkulatorZaCeliBroevi implements IMatematickiOperaciiCeliBroevi{
    @Override
    public int odzemanje(int x, int y) {
        int odzemanje;
        odzemanje=x-y;
        return odzemanje;
    }

    @Override
    public int sobiranje(int x, int y) {
        int sobiranje;
        sobiranje=x+y;
        return sobiranje;
    }

    @Override
    public int mnozenje(int x, int y) {
        int mnozenje;
        mnozenje=x*y;
        return mnozenje;
    }

    @Override
    public int delenje(int x, int y) {
        int delenje;
        delenje=x/y;
        return delenje;
    }

    @Override
    public int ostatok(int x, int y) {
        int ostatok;
        ostatok=x%y;
        return ostatok;
    }

    @Override
    public int stepenuvanje(int x, int y) {
        int stepenuvanje;
        stepenuvanje = (int)Math.pow(x,y);
        return stepenuvanje;
    }
}
