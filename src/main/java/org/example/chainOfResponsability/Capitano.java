package org.example.chainOfResponsability;

public class Capitano extends GradoEsercito {
    public Capitano(Maggiore maggiore) {
        super(maggiore);
        setGrado("Capitano");
        setStipendio(2000);
    }
}
