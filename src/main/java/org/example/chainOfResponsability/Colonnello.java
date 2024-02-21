package org.example.chainOfResponsability;

public class Colonnello extends GradoEsercito {
    public Colonnello(Generale generale) {
        super(generale);
        setGrado("Colonnello");
        setStipendio(4000);
    }
}
