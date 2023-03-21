/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota1 ");
        System.out.println("Digite a nota2");
      float nota1 = in.nextFloat ();
      float nota2 = in.nextFloat () ;     
      System.out.println("A nota do aluno e: " + (nota1+ nota2)/2 );
    }
    
}
