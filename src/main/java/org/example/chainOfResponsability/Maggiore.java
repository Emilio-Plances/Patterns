package org.example.chainOfResponsability;

public class Maggiore extends GradoEsercito {
    public Maggiore(Colonnello colonnello) {
        super(colonnello);
        setGrado("Maggiore");
        setStipendio(3000);
    }
}
