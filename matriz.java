public class Matriz {
    
    public static void main(String[] args){
        
        int[][] MatrizInt = new int[5][5];
        String[][] matriz = {{"00", "01"}, {"10", "11"}};
        
        // populate MatrizInt with values
        for (int i = 0; i < MatrizInt.length; i++) {
            for (int j = 0; j < MatrizInt[i].length; j++) {
                MatrizInt[i][j] = i * j;
            }
        }
         System.out.println();
        
        // print MatrizInt
        for (int i = 0; i < MatrizInt.length; i++) {
            for (int j = 0; j < MatrizInt[i].length; j++) {
                System.out.print(MatrizInt[i][j] + " ");
            }
            System.out.println(); // add newline after each row
        }
         System.out.println();
        
        // print matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // add newline after each row
        }
    }
}
