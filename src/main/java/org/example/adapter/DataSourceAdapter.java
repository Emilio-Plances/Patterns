package org.example.adapter;

import java.time.LocalDate;

public class DataSourceAdapter implements DataSource{
    private Info info;

    public DataSourceAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome()+info.getCognome();
    }
    @Override
    public int getEta() {
        return LocalDate.now().getYear()-info.getDataDiNascita().getYear();
    }
}
