public class MyClass {
    public static void main(String args[]) {
        int[] numerosInt = new int[10];
        double[] numerosDou = new double[20];
        String[] alunos = {"Pedro", "Paulo", "José", "João"};
        String[] alunas = {"Maria", "Paula", "Joana", "Claudia"};
        short[] numerosShort = new short[] {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numerosInt.length; i++) {
            System.out.print(numerosInt[i] + " ");
        }
             System.out.println();
        
        for (int i = 0; i < numerosDou.length; i++) {
            System.out.print(numerosDou[i] + " ");
        }
             System.out.println();
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.print(alunos[i] + " ");
        }
            System.out.println();
        
        for (int i = 0; i < alunas.length; i++) {
            System.out.print(alunas[i] + " ");
        }
                System.out.println();
        
        for (int i = 0; i < numerosShort.length; i++) {
            System.out.print(numerosShort[i] + " ");
        }
            System.out.println();
    }
}
