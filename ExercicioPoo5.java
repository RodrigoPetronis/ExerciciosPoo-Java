/*
 5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
Cada objeto dessa classe deve guardar os seguintes dados do aluno:
matrícula, nome, 2 notas de prova e 1 nota de trabalho.

Escreva os seguintes métodos para esta classe:

a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
*/

package com.mycompany.exerciciopoo5;

/**
 *
 * @author W10
 */
public class ExercicioPoo5 {

    public static void main(String[] args) {
        
        Alunos a = new Alunos(123, "Rod",7,7,5);

        System.out.println("A média do aluno foi "+a.media());
        System.out.println("Ele precisa de "+a.Final()+" para passar");

    }
}
