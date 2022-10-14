
package com.mycompany.exerciciopoo3;

/**
 *
 * @author W10
 */
public class ExercicioPoo3 {

    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.39f, 40f);
        
        System.out.print("Altere o valor do litro: ");
        bomba.alterarValor(0);
        System.out.print("Altere o tipo de combustível: ");
        bomba.alterarCombustivel("");
        System.out.print("Altere a quantidade de combustível ");
        bomba.alterarQuantidadeCombustivel(0);
        
        System.out.println("Foi abastecido "+ bomba.abastecerPorValor(200) +
                " litros de "+bomba.getTipoCombustivel()+" com o montante informado");
        System.out.println("O valor total foi de "+bomba.abastecerPorLitro(40)+
        " Reais pela quantidade de litros informada.");
        
        
    }
}
