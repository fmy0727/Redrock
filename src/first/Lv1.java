package first;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        System.out.print("冒泡排序后的结果后：" + "\n");
        fun(15, 25, 10, 30, 40, 20, 50);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + "请输入一个待插入的数：");
        int in = sc.nextInt();
        System.out.println("插入数字（" + in + "）之后冒泡排序的结果为：");
        fun(15, 25, 10, 30, 40, 20, 50, in);
    }

    public static void fun(int... arg) {
        for (int a = 0; a < arg.length - 1; a++) {
            for (int i = 0; i < arg.length - 1 - a; i++) {
                if (arg[i] > arg[i + 1]) {
                    int temp = arg[i];
                    arg[i] = arg[i + 1];
                    arg[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
    }
}