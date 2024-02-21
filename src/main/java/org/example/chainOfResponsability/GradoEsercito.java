package org.example.chainOfResponsability;

public abstract class MembroEsercito {
    private MembroEsercito gradoSuccessivo;
    private int stipendio;
    public int getStipendio() {
        return stipendio;
    }
    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }
    public MembroEsercito getGradoSuccessivo() {
        return gradoSuccessivo;
    }
    public void setGradoSuccessivo(MembroEsercito gradoSuccessivo) {
        this.gradoSuccessivo = gradoSuccessivo;
    }
}
