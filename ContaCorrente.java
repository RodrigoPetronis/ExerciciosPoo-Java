/*
 2. Crie uma classe para implementar uma ContaCorrente.
A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 
Os métodos são os seguintes: alterarNome, depósito esaque;
No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.*/

package com.mycompany.exerciciopoo2;

public class ContaCorrente {

    private int NumConta;
    private String Nome;
    private float Saldo;

    //Criado 2 metodos construtores com o mesmoo nome (1 com parametro Saldo e outro sem)
    public ContaCorrente(int NumConta, String Nome, float Saldo) {
        this.NumConta = NumConta;
        this.Nome = Nome;
        this.Saldo = Saldo;

    }
    public ContaCorrente(int NumConta, String Nome) {
        this.NumConta = NumConta;
        this.Nome = Nome;
        this.Saldo = 0.0f;
    }
    
    public String alterarNome(String Nome) {
       return this.Nome = Nome;
        
    }

    public float deposito(float deposito) {
        return this.Saldo += deposito;
    }

    public float saque(float saque) {
        return this.Saldo -= saque;
    }

    public int getNumConta() {
        return NumConta;
    }

    
    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

   
    
}
