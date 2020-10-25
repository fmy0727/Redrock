package first;

import java.util.Random;
import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        System.out.println("请为对称矩阵输入行列数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("随机对称矩阵A为：");
        int[][] matrixA = Matrix(n);
        System.out.println("随机对称矩阵B为：");
        int[][] matrixB = Matrix(n);
        System.out.println("相乘后的对称矩阵为：");
        int[][] matrixR = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    int temp = matrixA[i][k] * matrixB[k][j];
                    sum = sum + temp;
                }
                matrixR[i][j] = sum;
                System.out.print(matrixR[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

            int temp = matrixR[i][i];
            sum = sum + temp;
        }
        System.out.println("此矩阵对角线之和为：" + sum);
    }

    public static int[][] Matrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Random r = new Random();
                matrix[i][j] = r.nextInt(99);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void out(int n, int[][] matrixA) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j]);
            }
        }
    }

}