/*11. Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor. Crie uma
classe IngressoVIP, que herda de Ingresso e possui um valor adicional.
Crie um método que retorne o valor do ingresso VIP (com o adicional incluído).
Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.*/

package com.mycompany.exerciciopoo11;


public class Ingresso {
    private float valor = 150;
    
    
    
    public Ingresso(){
     
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
