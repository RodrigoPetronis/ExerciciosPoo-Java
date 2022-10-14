package com.mycompany.exerciciopoo04a;

import java.util.Scanner;

public class ExercicioPoo04a {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Elevador E = new Elevador(5, 3);
        int resp = 0;
        
        System.out.println("O Elevador está iniciado no Térreo e vazio");
        
        while (resp != 5) {
            
        System.out.println("Digite 1 para Entrar \nDigite 2 para Sair"
                + "\nDigite 3 para Subir\nDigite 4 para Descer\nDigite 5 para encerrar");
        
        resp = leitor.nextInt();

        switch (resp) {
            case 1:
                E.Entrar();
                System.out.println("Você está no " + E.getAndarAtual() + "° andar"
                        + " e tem " + E.getQntPessoas() + " pessoas no elevador");
                break;
            case 2:
                E.Sair();
                System.out.println("Você está no " + E.getAndarAtual() + "° andar"
                        + " e tem " + E.getQntPessoas() + " pessoas no elevador");
                break;
            case 3:
                E.Subir();
                System.out.println("Você está no " + E.getAndarAtual() + "° andar"
                        + " e tem " + E.getQntPessoas() + " pessoas no elevador");
                break;
            case 4:
                E.Descer();
                System.out.println("Você está no " + E.getAndarAtual() + "° andar"
                        + " e tem " + E.getQntPessoas() + " pessoas no elevador");
                break;
            default:
                System.out.println("Digite um número válido!");

        }
    }

}
}
