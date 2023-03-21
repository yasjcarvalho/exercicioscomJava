/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimindo;
import java.text.DecimalFormat;
/**
 *
 * @author aluno.ifal
 */
public class Imprimindo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.print("O valor de A é: ");
        System.out.println(a);
        System.out.println("O valor de B é: " + b);
        System.out.println("O valor de A+B é: " + (a + b));
        float c = 10;
        float d = 9;
        double e = 8.5;
        DecimalFormat formatador = new DecimalFormat("0.0");
                System.out.print("O valor da media é: " + formatador.format(c+d+e/3));
    }
    
}
