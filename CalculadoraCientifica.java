package com.mycompany.exerciciopoo13;

import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica() {
        super(); 
    }

    public double RaizQuadrada(int x) {
        return Math.sqrt(x);
    }
    public double Potencia(int x, int y){
        return Math.pow(x,y);
    }

}
