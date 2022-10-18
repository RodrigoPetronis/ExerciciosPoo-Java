/*
10. Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os
dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35. */
package com.mycompany.exerciciopoo10;

import java.util.Scanner;

public class ExercicioPoo10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JogadorFutebol j = new JogadorFutebol("Clodoaldo", "meio campo", 2000, "Brasileiro", 1.900f, 90.0f);
        System.out.println(j.getPosicao());

        int resp = 0;
        while (resp != 3) {
            System.out.println("1- Quanto para Aposentar. \n2- Mostrar dados.\n 3- Sair.");
            resp = input.nextInt();
            switch (resp) {
                case 1:
                    System.out.println(j.Aposentar());
                    break;
                case 2:
                    System.out.println(j.Imprimir());
            }
        }

    }
}
