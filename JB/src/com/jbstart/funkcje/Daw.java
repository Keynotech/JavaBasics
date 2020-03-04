package com.jbstart.funkcje;

public class Daw {
    String wlasciciel;
    public Daw(String wlasciciel){
        this.wlasciciel = wlasciciel;
        Wlasciciel();
    }

    private void Wlasciciel(){
        System.out.println("Jestem "+this.wlasciciel+", właścicielem konia ");
    }

}
