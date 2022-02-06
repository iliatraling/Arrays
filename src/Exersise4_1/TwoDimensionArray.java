package Exersise4_1;
//Использование двумерного массива.
public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] table = new int[3][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = j + 4 * i;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
