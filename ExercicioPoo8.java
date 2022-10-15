/*
8. Escreva uma classe Data cuja instância (objeto) represente uma data.
Esta classe deverá dispor dos seguintes métodos:

a. Construtor: define a data que determinado objeto (através de parâmetro),este 
método verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001

b. Compara: recebe como parâmetro um outro objeto da Classe data, 
compare com a data corrente e retorne:

i. 0 se as datas forem iguais;
ii. 1 se a data corrente for maior que a do parâmetro;
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
 */
package com.mycompany.exerciciopoo8;


public class ExercicioPoo8 {

    public static void main(String[] args) {
        Data d = new Data(15,10,2022);
        Data clone = new Data(20,10,2021);
        int dia = 15;
        int mes = 10;
        int ano = 2022;
       

        System.out.println(d.Construtor());
        System.out.println(d.Comparar());
        System.out.println(d.GetMesExtenso(d.getMesAtual()));
        System.out.println(d.getDia());
        System.out.println(d.getMes());
        System.out.println(d.getAno());
        System.out.println("----------- Clone Abaixo --------");
        System.out.println(clone.Construtor());
        System.out.println(clone.Comparar());
        System.out.println(clone.GetMesExtenso(clone.getMesAtual()));
        System.out.println(clone.getDia());
        System.out.println(clone.getMes());
        System.out.println(clone.getAno());
        
        //System.out.println(d.getDiaAtual()+"/"+d.getMesAtual()+"/"+d.getAnoAtual());

    }
}
