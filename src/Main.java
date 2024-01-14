import java.text.Format;
import java.util.*;


public class Main {
    static public void main(String[] args){
        int[][] matrix = multiplicationTable(3);
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j]);
            }
        }

    }

    public static int [][] multiplicationTable(int n){
        int[][] matrix = new int[n][n];
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                matrix[i - 1][j - 1] = i * j;
            }
        }
        char[] chrArr = {'a', 'b', 'c'};
        

        return matrix;
    }

}
