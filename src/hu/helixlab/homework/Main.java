package hu.helixlab.homework;

import hu.helixlab.homework.homework06.*;

public class Main {

    public static void main(String[] args) {
/*
        Sort sort = new Sort();

        System.out.println();
        System.out.println("Első és negyedik feladat");

        int[] bubble = {8, 7, 3, 2, 10, 5, 6, 4, 1, 9};
        sort.bubbleSort(bubble);


        String choice = ("cs");
        int[] insert = {2, 6, 9, 1, 10, 4, 3, 5, 7, 8};
        sort.insertionSort(insert, choice);

        MatrixOperation matrixOperation = new MatrixOperation();

        System.out.println();
        System.out.println("Második feladat");

        int[][] array = {{1,0,1,1},{0,1,1,1},{1,0,0,0},{0,0,0,0}};
        matrixOperation.printMatrix(array);

        System.out.println();
        System.out.println("Harmadik feladat");

        matrixOperation.initMatrixWithRandomNumbers(5,4, 2,5);
*/
        //---------------------------------------------------------------------------------

        //2. This will print the perimeters and areas of a rectangle and a triangle.
        Rectangle rectangle = new Rectangle();
        System.out.println("A téglalap kerülete: " + rectangle.getPerimeter());
        System.out.println("A téglalap területe: " + rectangle.getArea());

        System.out.println();
        Triangle triangle = new Triangle();
        System.out.println("A háromszög kerülete: " + triangle.getPerimeter());
        System.out.println("A háromszög területe: " + triangle.getArea());

        //4. This will multiply an array with a scalar and print the multiplied array.
        System.out.println();
        MatrixOperation matrixOperation = new MatrixOperation();
        int [][] multiplyInArray = {{3, 5, 2, 4},{6, 9, 1, 3},{4, 7, 8, 9}};
        matrixOperation.multiplyWithScalar(3, multiplyInArray);

        //5. This will multiply two array elements with each other.
        System.out.println();
        int[][] sumArrayFirst = {{1, 7, 8, 3},{3, 5, 2, 7},{4, 7, 3, 1}};
        int[][] sumArraySecond = {{4, 3, 7, 6},{6, 9, 10, 3},{2, 6, 1, 5}};
        matrixOperation.sum(sumArrayFirst, sumArraySecond);
    }
}
