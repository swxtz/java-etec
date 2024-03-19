package com.swxtz.model;

import java.util.ArrayList;
import java.util.Date;

public class Corrida {
    public Date inicio;

    Pista pistaEscolhida;
    private ArrayList<Carro> carros = new ArrayList<Carro>();

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public Pista getPistaEscolhida() {
        return pistaEscolhida;
    }

    public void setPistaEscolhida(Pista pistaEscolhida) {
        this.pistaEscolhida = pistaEscolhida;
    }

    public void setCarros(Carro carro) {
        this.carros.add(carro);
    }
}
