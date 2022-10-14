/*
3. Crie uma classe para representar uma BombaCombustivel.
A classe BombaCombustivel deve conter os seguintes atributos:
tipo de combustível, valor por litro e quantidade de combustível. 
Além desses atributos a classes deve conter os seguintes métodos.

a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de
litros que foi colocada no veículo

b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o
valor a ser pago pelo cliente.

c. alterarValor; //altera o valor do litro do combustível.

d. alterarCombustivel; //altera o tipo do combustível.

e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba. 
 */
package com.mycompany.exerciciopoo3;
import java.util.Scanner;
public class BombaCombustivel {
    Scanner leitor = new Scanner(System.in);
    private String TipoCombustivel;
    private float ValorLitro;
    private float QntCombustivel;

    public BombaCombustivel(String TipoCombustivel, float ValorLitro, float QntCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
        this.ValorLitro = ValorLitro;
        this.QntCombustivel = QntCombustivel;
    }

    public float abastecerPorValor(float valor) {
        return valor/this.ValorLitro;
    }
    public float abastecerPorLitro(float litro){
        return litro*this.ValorLitro;
    }
    public void alterarValor(float ValorLitro){
         this.setValorLitro(leitor.nextFloat());
    }
    public void alterarCombustivel(String TipoCombustivel){
        this.setTipoCombustivel(leitor.next());
    }
    public void alterarQuantidadeCombustivel(float qnt){
        this.setQntCombustivel(leitor.nextFloat());
    }
    
    
    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }

    public float getValorLitro() {
        return ValorLitro;
    }

    public void setValorLitro(float ValorLitro) {
        this.ValorLitro = ValorLitro;
    }

    public float getQntCombustivel() {
        return QntCombustivel;
    }

    public void setQntCombustivel(float QntCombustivel) {
        this.QntCombustivel = QntCombustivel;
    }

}
