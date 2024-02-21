package org.example.chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        Generale generale=new Generale();
        Colonnello colonnello=new Colonnello(generale);
        Maggiore maggiore=new Maggiore(colonnello);
        Capitano capitano=new Capitano(maggiore);
        Tenente tenente=new Tenente(capitano);

        tenente.stipendioMaggioreDiValore(2500);
    }
}
