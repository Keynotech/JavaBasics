package com.jbstart.funkcje;

public class Rad {

    String imie;
    String zachowanie;
    int wiek;
    public Rad(String imie, String zachowanie, int wiek){
        this.imie = imie;
        this.zachowanie = zachowanie;
        this.wiek = wiek;
        Przedstaw_Sie();
    }

    private void Przedstaw_Sie(){
        System.out.println("Jestem "+this.imie+", jestem bardzo "+this.zachowanie+" i mam "+this.wiek+" lat");
    }



}
