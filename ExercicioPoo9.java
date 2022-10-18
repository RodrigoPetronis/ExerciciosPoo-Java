/*
 9. Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a
ocupação das vagas. A classe deve ter os seguintes métodos:
a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para
armazenar a data utilize um objeto da classe Data, criada na questão anterior);
b. ProximoLivre: retorna o número da próxima cadeira livre
c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
contrário
e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
f. GetVoo: retorna o número do vôo
 */
package com.mycompany.exerciciopoo9;

import java.util.Scanner;

public class ExercicioPoo9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Voo v = new Voo(123, "15/10/2022");
        int resp = 0;
        
        while (resp != 5) {
            System.out.println("Voo " + v.getNumVoo() + "\n1- Verificar se assento está livre "
                    + "\n2- Proximo Assento Livre "
                    + "\n3- Ocupar Assento "
                    + "\n4-Vagas disponíveis "
                    + "\n5- Sair");
            resp = input.nextInt();

            switch (resp){
                case 1:
                    System.out.println("Digite o Assento ");
                    System.out.println(v.Verificar(input.nextInt()));
                    break;
                case 2:
                    System.out.println(v.ProximoLivre());
                    break;
                case 3:
                    System.out.println("Digite o Assento para Ocupar ");
                    System.out.println(v.Ocupar(input.nextInt()));
                    break;
                case 4:
                    System.out.println(v.Vagas());
                    break;
            }
        }
    }
}
