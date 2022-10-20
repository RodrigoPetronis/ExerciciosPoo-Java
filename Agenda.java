/*12. Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes
operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.*/
package com.mycompany.exerciciopoo12;

import java.util.Arrays;

public class Agenda {

    private String[] nome = new String[10];
    private int[] idade = new int[10];
    private float[] altura = new float[10];

    public String armazenarPessoa(String name, int age, float size) {
        String resp = "Agenda Cheia";
        for (int i = 0; i < nome.length; i++) {
            if (nome[i] == null) {
                nome[i] = name;
                idade[i] = age;
                altura[i] = size;
                resp = "Adicionado";
                break;
            }
        }
        return resp;
    }

    public String removerPessoa(String name) {
        int i = buscarPessoa(name);
        nome[i] = null;
        idade[i] = 0;
        altura[i] = 0;
        String resp = "Contato Removido";
        return resp;
    }

    public int buscarPessoa(String name) {
        int posicao = 99;
        for (int i = 0; i < nome.length; i++) {
            String[] aux = {nome[i]};
            if (name.equalsIgnoreCase(aux[0])) {
                posicao = i;
            }
        }
        return posicao;
    }

    public void imprimirAgenda() {
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Posição: " + i + ""
                    + "\nNome: " + nome[i] + ""
                    + "\nIdade: " + idade[i] + ""
                    + "\nAltura: " + altura[i] + ""
                    + "\n");
        }
    }

    public String imprimirPessoa(int i) {
        String resp = "";
        resp = "Posição " + i + ""
                + "\nNome: " + nome[i] + ""
                + "\nIdade: " + idade[i] + ""
                + "\nAltura: " + altura[i] + "";
        return resp;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public int[] getIdade() {
        return idade;
    }

    public void setIdade(int[] idade) {
        this.idade = idade;
    }

    public float[] getAltura() {
        return altura;
    }

    public void setAltura(float[] altura) {
        this.altura = altura;
    }

}
