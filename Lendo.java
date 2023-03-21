/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lendo;

import java.util.Scanner;
/**
 *
 * @author aluno.ifal
 */
public class Lendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = in.nextInt(); 
        
        System.out.println("O número digitado foi: " + numero);
    }
    
}
