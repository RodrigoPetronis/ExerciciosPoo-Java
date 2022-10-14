/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exerciciopoo6;

/**
 *
 * @author W10
 */
public class ExercicioPoo6 {

    public static void main(String[] args) {
        
        invoice in = new invoice(1,"Pranchas",50, 650.5f);
        System.out.println(in.getInvoiceAmount(50,1000));
    }
}
