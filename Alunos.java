/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopoo5;


public class Alunos {
    
    private int matricula;
    private String nome;
    private float n1;
    private float n2;
    private float trabalho;

    public Alunos(int matricula, String nome, float n1, float n2, float trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.trabalho = trabalho;
    }
    
    public double media(){
        return ((((n1+n2)*2.5) +(trabalho*2))/7);
    }
    
    public double Final(){
        if (media() < 7){
            return  7 - media();
        }else {
            return 0;
        }
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }
    
}
