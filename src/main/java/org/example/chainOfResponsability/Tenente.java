package org.example.chainOfResponsability;

public class Tenente extends GradoEsercito {
    public Tenente(Capitano capitano) {
        super(capitano);
        setGrado("Tenente");
        setStipendio(1000);
    }
}
