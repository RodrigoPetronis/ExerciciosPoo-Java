/*
4. Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio.
A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes nele.
A classe deve também disponibilizar os seguintes métodos:

a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);*/
package com.mycompany.exerciciopoo04a;


public class Elevador {

    private int AndarAtual = 0;
    private int TotAndares;
    private int Capacidade;
    private int QntPessoas = 0;

    /*a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
prédio (os elevadores sempre começam no térreo e vazio);
     */
    
    public Elevador(int Capacidade, int TotAndares) {
        this.Capacidade = Capacidade;
        this.TotAndares = TotAndares;
    }

    public int Entrar() {
        if (QntPessoas == Capacidade) {
            
        } else {
            this.setQntPessoas(QntPessoas + 1);
        }
        return QntPessoas;
    }

    public int Sair() {
        if (QntPessoas == 0) {
            
        } else {
            this.setQntPessoas(QntPessoas - 1);
        }
        return QntPessoas;
    }

    public int Subir() {
        if (AndarAtual == TotAndares) {
            
        } else {
            this.setAndarAtual(AndarAtual + 1);
        }
        return AndarAtual;
    }

    public int Descer() {
        if (AndarAtual == 0) {
            
        } else {
            this.setAndarAtual(AndarAtual - 1);
        }
        return AndarAtual;
    }

    public void setAndarAtual(int AndarAtual) {
        this.AndarAtual = AndarAtual;
    }

    public int getAndarAtual() {
        return AndarAtual;
    }

    public int getTotAndares() {
        return TotAndares;
    }

    public void setTotAndares(int TotAndares) {
        this.TotAndares = TotAndares;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public int getQntPessoas() {
        return QntPessoas;
    }

    public void setQntPessoas(int QntPessoas) {
        this.QntPessoas = QntPessoas;
    }

}
