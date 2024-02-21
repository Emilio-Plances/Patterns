package org.example.dominio;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private final List<Sezione> listaSezioni=new ArrayList<>();
    private final List<Autore> listaAutori=new ArrayList<>();
    private double prezzo;

    public void addSezione(Sezione sezione){
        listaSezioni.add(sezione);
    }
    public int getNumeroPagine() {
        return listaSezioni.stream().map(Sezione::getNumeroPagine).reduce(0, Integer::sum);
    }
}
