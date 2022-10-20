/*13. Crie uma classe Calculadora.
Esta classe deve implementar as operações básicas (soma, subtração, divisão e multiplicação).

Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que
implementa os seguintes cálculos: raizQuadrada e a potencia. 

Dica utilize a classe Math do pacote
java.lang. */


package com.mycompany.exerciciopoo13;


public class Calculadora {
    private int num;
    private int num2;
   

   
    
    public int soma(){
        
        return getNum() + getNum2();
    }
    
    public int subtrair(){
        return getNum() - getNum2();
    } 
    
    public float dividir(){
        return getNum() / getNum2();
    }
    
    public int multiplicar(){
        return getNum() * getNum2();
    }
    
    
    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return num2;
    }
}
