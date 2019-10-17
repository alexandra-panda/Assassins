//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.company;

public class GamerRoom {
    protected int NrStreet;
    protected int PricePerHours;
    protected int Seats;

    GamerRoom(int NrStreet, int PricePerHours,int Seats) {
        this.NrStreet=NrStreet;
        this.PricePerHours=PricePerHours;
        this.Seats=Seats;
    }

    public int getNrStreet(){return this.NrStreet;}

    public float getPricePerHours(){return this.PricePerHours; }

    public int   getSeats(){return this.Seats;}

    public void setNrStreet(int NrStreet){this.NrStreet=NrStreet; }

    public void setPricePerHours(int PricePerHours){this.PricePerHours=PricePerHours;}

    public void setSeats(int Seats){this.Seats=Seats;}

   public String toString(){
        return this.NrStreet + " " +this.PricePerHours + " " + this.Seats;

   }
}
