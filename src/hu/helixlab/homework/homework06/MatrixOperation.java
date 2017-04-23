package hu.helixlab.homework.homework06;

public class MatrixOperation implements IMatrixOperation{

    private int arrayLength;

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

    public int[][] multiplyWithScalar(int scalar, int[][] multiplyInArray){

        int[][] multipliedArray = new int[multiplyInArray.length][multiplyInArray[0].length];
        for(int i = 0; i < multiplyInArray.length; ++i){
            for(int j = 0; j < multiplyInArray[0].length; ++j) {
                multipliedArray[i][j] = multiplyInArray[i][j] * scalar;
                System.out.print("\t" + multipliedArray[i][j]);
            }
            System.out.println();
        }
        return multipliedArray;
    }

    public int[][] sum(int[][] sumArrayFirst, int[][] sumArraySecond){

        if(sumArrayFirst.length == sumArraySecond.length && sumArrayFirst[0].length == sumArraySecond[0].length){
            arrayLength = sumArrayFirst.length;
        }
        else{
            System.out.println("Nem egyforma méretű a két tömb!");
        }
        int[][] summedArray = new int[sumArrayFirst.length][sumArrayFirst[0].length];

        for(int i = 0; i < arrayLength; ++i){
            for(int j = 0; j < sumArrayFirst[0].length; ++j){
                summedArray[i][j] = sumArrayFirst[i][j] + sumArraySecond[i][j];
                System.out.print("\t" + summedArray[i][j]);
            }
            System.out.println();
        }
        return summedArray;
    }
}
