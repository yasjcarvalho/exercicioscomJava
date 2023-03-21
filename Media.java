/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media;

import java.util.Scanner;
/**
 *
 * @author aluno.ifal
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite nota1 ");
        float nota1 = in.nextFloat(); 
        
        System.out.println("Digite nota2: ");
        float nota2 = in.nextFloat(); 
        
        float media = ((nota1 + nota2) /2);
        System.out.println("O valor da média é " + media);
        
        if (media >= 9.0) {
            System.out.println("Conceito A");
        }else
            if (media >= 8.0){
                            System.out.println("Conceito B");

            }else
            if (media >= 7.0){
                            System.out.println("Conceito C");
            }else
            if (media >= 6.0){
                            System.out.println("Conceito D");
            }else
            System.out.println("Conceito F");
        
        switch (media/10){
            //Início do switch
            case 9: 
            case 10:
                System.out
        }
                
    }
    
}
