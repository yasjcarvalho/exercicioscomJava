// baixe o netbeans e teste
//usando import java.util.Scanner; e nextLine();
import java.util.Scanner;

public class ProgramaNomes {

    public static void main(String[] args) {


      Scanner sc = new Scanner(System.in);
             String[] nomes = new String[10];
       
                for(int i = 0 ; i < nomes.length; i++){
                  System.out.print("digite o seu nome: ");
                     nomes[i] = sc.nextLine();
                       
                }
           
                for(int i = 0; i < nomes.length; i++){              
                    System.out.println(nomes[i]);
                }
      
     }

}

//Usando vetores, escreva um programa em Java que leia do usuário o nome de 10 pessoas e, 
//após todas as leituras, exiba na tela o nome dos 10 usuários lindos.
