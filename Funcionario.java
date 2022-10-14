/*
7. A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as
três informações a seguir como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos.
Forneça os métodos getters e setters para cada atributo.
Se o salário mensal não for positivo, configure-o como 0.0. 

Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada
empregado.
 */

package com.mycompany.exerciciopoo7;

public class Funcionario {

    private String pNome;
    private String sNome;
    private float salario;

    public Funcionario(String pNome, String sNome, float salario) {
        this.pNome = pNome;
        this.sNome = sNome;
        this.setSalario(salario);
    }
    
    public String NomeCompleto(){
        return pNome +" "+sNome;
    }
    
    public float SalarioAnual(){
        return salario*12;
    }
    public float SalarioAnualAumento(){
        return (SalarioAnual()*1.1f);
    }

    public String getpNome() {
        return pNome;
    }

    public void setpNome(String pNome) {
        this.pNome = pNome;
    }

    public String getsNome() {
        return sNome;
    }

    public void setsNome(String sNome) {
        this.sNome = sNome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0.0f;
        } else {
            this.salario = salario;
        }
    }
}
