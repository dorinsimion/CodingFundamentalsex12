package com.company;

public class NumarComplex {
    private double parte_intreaga;
    private double parte_imaginara;

    NumarComplex (double parte_intreaga,double parte_imaginara){
        this.parte_intreaga=parte_intreaga;
        this.parte_imaginara=parte_imaginara;
    }

    public String toString(){
        return parte_intreaga+" + "+parte_imaginara+"*i";
    }

    public NumarComplex sum(NumarComplex n){
        double rez_parteintreaga;
        double rez_parteimaginara;
        rez_parteintreaga = parte_intreaga+n.parte_intreaga;
        rez_parteimaginara = parte_imaginara+n.parte_imaginara;
        return new NumarComplex(rez_parteintreaga,rez_parteimaginara);
    }

    public NumarComplex subtract(NumarComplex n){
        return new NumarComplex(parte_intreaga-n.parte_intreaga,
                parte_imaginara-n.parte_imaginara);
    }

    public boolean isReal(){
        return parte_imaginara==0;
    }
}
