package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,3);
        Matrix matrix2 = new Matrix(3, 2);

        Matrix matrix3 = matrix.prodMatrix(matrix2);
        matrix.showMatrix();
        matrix2.showMatrix();
        matrix3.showMatrix();
    }
}