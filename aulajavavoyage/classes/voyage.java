package com.aulajavavoyage;

import com.uninassau.interfaces.Montagem;
import com.uninassau.interfaces.Motor;
import com.uninassau.interfaces.Categoria;

public class HB20 implements Montagem, Motor, Categoria {
    @Override
    public String getAno() {
        return "2014";
    }

    @Override
    public String getModelo() {
        return "Voyage";
    }

    @Override
    public boolean isMotorNacional() {
        return false;
    }

    @Override
    public boolean isMontagemNacional() {
        return true;
    }

    @Override
    public String getTipo() {
        return "Sedã";
    }

    @Override
    public String getAmbiente() {
        return "Urbano";
    }
}
