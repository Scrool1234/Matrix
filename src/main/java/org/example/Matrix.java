package org.example;

import java.util.Random;

class Matrix {
    private int countRow;
    private int countCol;
    private double[][] matrix;

    Matrix(int countRow, int countCol) {
        this.countRow = countRow;
        this.countCol = countCol;
        this.matrix = setMatrix(countRow, countCol);
    }

    Matrix(double[][] matrix) {
        this.countRow = matrix.length;
        this.countCol = matrix[0].length;
        this.matrix = matrix;
    }

    public void setCountRow(int countRow) {
        this.countRow = countRow;
    }

    public int getCountRow() {
        return countRow;
    }

    public void setCountCol(int countCol) {
        this.countCol = countCol;
    }

    public int getCountCol() {
        return countCol;
    }

    public double[][] setMatrix(int countRow, int countCol) {
        Random random = new Random();
        double[][] matrix = new double[countRow][countCol];
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                matrix[i][j] = random.nextDouble(100);
            }
        }
        return matrix;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    //Операции с матрицами

    //Сумма матриц
    public Matrix sumMatrix(Matrix matrix) {
        if(this.countRow == matrix.getCountRow() && this.countCol == matrix.getCountCol()) {
            double[][] newMatrix = new double[countRow][countCol];
            for (int i = 0; i < matrix.countRow; ++i) {
                for (int j = 0; j < matrix.countCol; ++j) {
                    newMatrix[i][j] = this.matrix[i][j] + matrix.getMatrix()[i][j];
                }
            }
            return new Matrix(newMatrix);
        }
        return null;
    }

    //Умножение матрицы на число
    public Matrix multiplicationOfMatrixByNumber(int k) {
        double[][] newMatrix = new double[countRow][countCol];
        for(int i = 0; i < countRow; ++i) {
            for(int j = 0; j < countCol; ++j) {
                newMatrix[i][j] = matrix[i][j] * k;
            }
        }
        return new Matrix(newMatrix);
    }

    //Умножение матриц
    public Matrix prodMatrix(Matrix matrix) {
        if(this.countCol == matrix.countRow) {
            double[][] newMatrix = new double[this.countRow][matrix.countCol];
            for (int i = 0; i < this.countRow; i++) {
                for (int j = 0; j < matrix.countCol; j++) {
                    for (int g = 0; g < this.countCol; g++) {
                        newMatrix[i][j] += this.matrix[i][g] * matrix.getMatrix()[g][j];
                    }
                }
            }
            return new Matrix(newMatrix);
        }
        return null;
    }

    //Вывод матрицы
    public void showMatrix() {
        System.out.print("[");
        System.out.println();
        for(int i = 0; i < countRow; ++i) {
            System.out.print("[");
            for(int j = 0; j < countCol; ++j) {
                if(j != countCol - 1) {
                    System.out.print(matrix[i][j] + " ");
                }
                else {
                    System.out.print(matrix[i][j] + "]");
                }
            }
            System.out.println();
        }
        System.out.println("]");
        System.out.println();
    }
}