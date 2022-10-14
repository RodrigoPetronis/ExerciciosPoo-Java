/*
7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos getters e setters para
cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. 

Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
empregado.

 */
package com.mycompany.exerciciopoo7;

import java.util.Scanner;

public class ExercicioPoo7 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        String sobrenome;
        float salario;


        for (int i = 0; i < 2; i++) {
            System.out.print("Nome: ");
            nome = leitor.next();
            System.out.print("Sobrenome: ");
            sobrenome = leitor.next();
            System.out.print("Salario: ");
            salario = leitor.nextFloat();

            Funcionario f = new Funcionario(nome, sobrenome, salario);
            System.out.println(f.NomeCompleto());

            System.out.println("O Salario Anual do funcionário " + f.NomeCompleto() + ""
                    + " é " + f.SalarioAnual());
            
            System.out.println("O Salario Anual com aumento de 10% do funcionario "
                    + "" + f.NomeCompleto() + " é " + f.SalarioAnualAumento());
        }
    }
}
