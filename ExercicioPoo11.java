/*11. Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor. Crie uma
classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um método que retorne o
valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.*/

package com.mycompany.exerciciopoo11;


public class ExercicioPoo11 {

    public static void main(String[] args) {
        Ingresso I = new Ingresso();
        IngressoVip Iv = new IngressoVip();
        
        System.out.println("O valor do Ingresso é " + I.getValor());
        System.out.println("O valor do IngressoVip é "+ Iv.ValorVip());
       
    }
}
