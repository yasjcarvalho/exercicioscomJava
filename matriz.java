import java.util.Arrays;


public class aleatorio {
    public static void main(String args[]) {
      int matrizInt[][] = new int [5] [5];
      
      String[] [] matriz = {{"00", "01"}, {"10", "11"}};
     
      System.out.println("A:" + Arrays.deepToString(matrizInt));
            System.out.println("B:" + Arrays.deepToString(matriz));

    }
}

public class Matriz {
    
    public static void main(String[] args){
        
        int[][] MatrizInt = new int[5][5];
        String[][] matriz = {{"00", "01"}, {"10", "11"}};
        
        // popular MatrizInt com valores
        for (int i = 0; i < MatrizInt.length; i++) {
            for (int j = 0; j < MatrizInt[i].length; j++) {
                MatrizInt[i][j] = i * j;
            }
        }
        
        // printar MatrizInt
        for (int i = 0; i < MatrizInt.length; i++) {
            for (int j = 0; j < MatrizInt[i].length; j++) {
                System.out.print(MatrizInt[i][j] + " ");
            }
            System.out.println(); // adicionar uma nova linha depois de cada linha 
        }
        
        // printar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // adicionar uma nova linha depois de cada linha 
        }
    }
}
