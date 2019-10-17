//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.company;

public class JocuriVideo extends GamerRoom {
    private String NameOfGame;
    private String Brand;
    private float Price;
    private String KindOfGame;

    JocuriVideo(int NrStreet, int  PricePerHours, int Seats, String NameOfGame, String Brand, float Price, String KindOfGame) {
        super(NrStreet, PricePerHours, Seats);
        this.NameOfGame = NameOfGame;
        this.Brand = Brand;
        this.Price = Price;
        this.KindOfGame = KindOfGame;
    }

    public String NameOfGame() {
        return this.NameOfGame;
    }

    public void setNameOfGame(String NameOfGame) {
        this.NameOfGame = NameOfGame;
    }

    public String Brand() {
        return this.Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public float Price() {
        return this.Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String KindOfGame() {
        return this.KindOfGame;
    }

    public void setKindOfGame(String KindOfGame) {
        this.KindOfGame = KindOfGame;
    }

    public String toString(){
 return this.NrStreet +" "+this.PricePerHours +" "+this.Seats +" "+this.NameOfGame +" "+this.Brand +" "+" "+this.KindOfGame;
}
}
