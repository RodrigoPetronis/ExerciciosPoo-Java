/*Crie uma classe para representar uma Pessoa com os atributos privados de nome,
data de nascimento e altura. 
Crie os métodos públicos necessários para getters e setters e
também um método para imprimir todos dados de uma pessoa.
Crie um método para calcular a idade da pessoa.
*/



package exerciciopoo1;

import java.util.Scanner;

public class ExercicioPoo1 {

    public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);   
       Pessoa p = new Pessoa();
       System.out.print("Nome: ");
       p.setnome(leitor.next());
       System.out.print("Ano de Nascimento: ");
       p.setAnoNascimento(leitor.nextInt());
       System.out.print("Altura: ");
       p.setAltura(leitor.nextFloat());
       
       
       System.out.println(p.dadosPessoa());
        
    }
    
}
