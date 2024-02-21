package org.example.chainOfResponsability;

public abstract class GradoEsercito {
    private String grado;
    private GradoEsercito gradoSuccessivo;
    private int stipendio;
    public GradoEsercito() {}
    public GradoEsercito(GradoEsercito gradoSuccessivo) {
        this.gradoSuccessivo = gradoSuccessivo;
    }

    public int getStipendio() {
        return stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public GradoEsercito getGradoSuccessivo() {
        return gradoSuccessivo;
    }
    public void setGradoSuccessivo(GradoEsercito gradoSuccessivo) {
        this.gradoSuccessivo = gradoSuccessivo;
    }
    public String getGrado() {
        return grado;
    }
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public void stipendioMaggioreDiValore(int valore){
        if (stipendio>=valore){
            System.out.println("Il "+grado+" ha uno stipendio maggiore");

        }
        if(gradoSuccessivo!=null) gradoSuccessivo.stipendioMaggioreDiValore(valore);
    }
}
