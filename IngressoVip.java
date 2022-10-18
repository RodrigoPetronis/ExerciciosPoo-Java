/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopoo11;

/**
 *
 * @author W10
 */
public class IngressoVip extends Ingresso {
    private float adicional = 50;
            
    public IngressoVip(){
        super();
    }
    
    public float ValorVip(){
        return (super.getValor()+ this.adicional);
    }
    
    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    
    
}
