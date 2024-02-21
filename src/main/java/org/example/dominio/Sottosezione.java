package org.example.dominio;

import java.util.ArrayList;
import java.util.List;

public class Sottosezione {
    private final List<Pagina> listaPagine=new ArrayList<>();
    private int numeroPagine;

    public void addPagina(Pagina pagina){
        listaPagine.add(pagina);
        setNumeroPagine(listaPagine.size());
    }
    public int getNumeroPagine() {
        return numeroPagine;
    }
    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
}
