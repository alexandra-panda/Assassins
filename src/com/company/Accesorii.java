//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.company;

public class Accesorii extends GamerRoom {
    private String NameAccessories;
    private int NrAccessories;
    private int YearOfProduction;

    Accesorii(int NrStreet, int PricePerHours, int Seats, String NameAccessoiries, int NrAccessories, int YearOfPRoduction) {
        super(NrStreet, PricePerHours, Seats);
        this.NameAccessories = NameAccessoiries;
        this.NrAccessories = NrAccessories;
        this.YearOfProduction = YearOfPRoduction;
    }

    public String getNameAccessories() {
        return this.NameAccessories;
    }

    public void setNameAccessories(String NameAccessoires) {
        this.NameAccessories = NameAccessoires;
    }

    public int getNrAccessories() {
        return this.NrAccessories;
    }

    public void setNrAccessories(int NrAccessoires) {
        this.NrAccessories = NrAccessoires;
    }

    public int getYearOfProduciton() {
        return this.YearOfProduction;
    }

    public void setYearOfProduction(int YearOfProduction) {
        this.YearOfProduction = YearOfProduction;
    }
    public String toString(){
        return this.NrStreet +" "+this.PricePerHours +" "+this.Seats +" "+this.NameAccessories +" "+this.NrAccessories +" "+" "+this.YearOfProduction;
}
}
