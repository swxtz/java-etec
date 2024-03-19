package com.swxtz;


import com.swxtz.model.Carro;
import com.swxtz.model.Corrida;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        Corrida corrida = new Corrida();


        corrida.setCarros(carro1);
        corrida.setCarros(carro2);
        corrida.setCarros(carro3);

    }
}