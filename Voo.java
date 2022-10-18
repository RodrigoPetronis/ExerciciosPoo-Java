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

import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class Voo {

    /*LocalDate dd = LocalDate.now();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
     */
    private int NumVoo;
    private String data;
    private int[] Assento = new int[100];
    private int[] Vazio = {0};

    public Voo(int NumVoo, String data) {
        this.NumVoo = NumVoo;
        this.data = data;
    }

    public int ProximoLivre() {//retorna o número da próxima cadeira livre
        int i;
        int resp = 0;
        for (i = 0; i < Assento.length; i++) {
            if (Assento[i+1] == Vazio[0]) {
                resp = i+1;
                break;
            } else {
                resp = -1;
            }            
        }return resp;
    }
    
    public String Verificar(int num) { // (OK)verifica se o número da cadeira recebido como parâmetro está ocupada
        String resp = "";
            if (Assento[num] == Vazio[0]) {
                resp = "Livre";
            } else {
                resp = "Ocupado";
            }return resp;
    }
    
        /*ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso
contrário*/
    
        
    public String Ocupar(int num) {
        String resp = "";
        if (Assento[num+1] == Vazio[0]) {
            Assento[num] = 1;
            resp = "Operação bem sucedida.";
        }else{
            resp = "Assento Ocupado";
        }return resp;
    }

    public int Vagas() { //retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
        int disponiveis = 0;
        for (int i = 0 ; i < Assento.length; i++){
            if (Assento[i] == Vazio[0]){
                disponiveis = disponiveis + 1;
            }
        }return disponiveis;
    }

    public void setNumVoo(int NumVoo) {
        this.NumVoo = NumVoo;
    }

    public int getNumVoo() {
        return NumVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int[] getAssento() {
        return Assento;
    }

    public void setAssento(int[] Assento) {
        this.Assento = Assento;
    }

    public int[] getVazio() {
        return Vazio;
    }

    public void setVazio(int[] Vazio) {
        this.Vazio = Vazio;
    }

}

