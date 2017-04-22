package hu.helixlab.homework.homework06;

public interface IMatrixOperation {

    void printMatrix(int[][] array);

    int[][] initMatrixWithRandomNumbers(int m, int n, int randomMin, int randomMax);

    int[][] multiplyWithScalar(int scalar, int[][] multiplyInArray);

    int[][] sum(int[][] sumArrayFirst, int[][] sumArraySecond);
}
