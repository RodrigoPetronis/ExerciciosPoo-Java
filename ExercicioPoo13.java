/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exerciciopoo13;

import java.util.Scanner;

public class ExercicioPoo13 {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        Calculadora c = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
        c.setNum(9);
        c.setNum2(3);
        
        System.out.println("Soma = " + c.soma());
        System.out.println("Subtração = " + c.subtrair());
        System.out.println("Divisão = " + c.dividir());
        System.out.println("Multiplicação = " + c.multiplicar());
        System.out.println("Raiz Quadrada = " + cc.RaizQuadrada(c.getNum()));
        System.out.println("Potencia = " + cc.Potencia(c.getNum(),c.getNum2()));
    }
}
