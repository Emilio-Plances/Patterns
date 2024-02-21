package org.example.dominio;

public class Main {
    public static void main(String[] args) {
        Pagina p1=new Pagina();
        Pagina p2=new Pagina();
        Pagina p3=new Pagina();
        Pagina p4=new Pagina();
        Pagina p5=new Pagina();
        Pagina p6=new Pagina();
        Pagina p7=new Pagina();
        Pagina p8=new Pagina();
        Pagina p9=new Pagina();
        Pagina p10=new Pagina();

        Sottosezione ss1=new Sottosezione();
        ss1.addPagina(p1);
        ss1.addPagina(p2);
        ss1.addPagina(p3);

        Sottosezione ss2=new Sottosezione();
        ss2.addPagina(p4);
        ss2.addPagina(p5);
        ss2.addPagina(p6);

        Sezione s1=new Sezione();
        s1.addSottosezione(ss1);
        s1.addSottosezione(ss2);
        Sezione s2=new Sezione();
        s2.addSottosezione(ss1);

        Libro l=new Libro();
        l.addSezione(s1);
        l.addSezione(s2);

        System.out.println(ss1.getNumeroPagine());
        System.out.println(s1.getNumeroPagine());
        System.out.println(l.getNumeroPagine());


    }
}
