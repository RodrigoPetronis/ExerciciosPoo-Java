/*
12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações:

a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.
 */
package com.mycompany.exerciciopoo12;

import java.util.Scanner;

public class ExercicioPoo12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda A = new Agenda();
        int resp = 0;
        while (resp != 6) {
            System.out.println("Agenda\n 1- Armazenar\n2- Remover\n3- Buscar Pessoa"
                    + "\n4- Mostrar Todos\n5- Mostrar por posição\n6- Sair");
            resp = input.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Digite o Nome, Idade e Altura");
                    System.out.println(A.armazenarPessoa(input.next(), input.nextInt(), input.nextFloat()));
                    break;
                case 2:
                    System.out.println("Digite o nome para remover:");
                    System.out.println(A.removerPessoa(input.next()));
                    break;
                case 3:
                    System.out.println("Digite o nome para buscar:");
                    System.out.println("A pessoa está na posição " + A.buscarPessoa(input.next()));
                    break;
                case 4:
                    A.imprimirAgenda();
                    break;
                case 5:
                    System.out.println("Digite a posição da pessoa na agenda:");
                    System.out.println(A.imprimirPessoa(input.nextInt()));
                    break;
                case 6:
                    System.out.println("Valeu!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }

    }
}
