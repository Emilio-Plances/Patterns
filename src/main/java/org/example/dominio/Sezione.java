package org.example.dominio;

import java.util.ArrayList;
import java.util.List;

public class Sezione {
    private final List<Sottosezione> listaSottosezioni=new ArrayList<>();

    public void addSottosezione(Sottosezione sottosezione){
        listaSottosezioni.add(sottosezione);
    }
    public int getNumeroPagine() {
        return listaSottosezioni.stream().map(Sottosezione::getNumeroPagine).reduce(0, Integer::sum);
    }
}
