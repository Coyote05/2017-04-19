package hu.helixlab.homework.homework06;

public class MatrixOperation implements IMatrixOperation{

    public void printMatrix(int[][] array){

        for(int i = 0; i < array.length; ++i){
            for(int j = 0; j < array.length; ++j){

                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] initMatrixWithRandomNumbers(int m, int n, int randomMin, int randomMax){

        int[][] array2 = new int[m][n];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){

                int randomNumber = randomMin + (int)(Math.random() * ((randomMax - randomMin) + 1));

                array2[i][j] = randomNumber;

                System.out.print("\t" + array2[i][j]);
            }
            System.out.println();
        }
        return array2;
    }
}
