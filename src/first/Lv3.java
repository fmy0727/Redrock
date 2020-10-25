package first;

import java.util.Scanner;

class Food {
    String name;
    int tariff;
    int number;

    public void tell1() {
        System.out.println(number + "." + name + "\t" + tariff + "元");
    }
}

public class Lv3 {
    public static void main(String[] args) {
        System.out.println("欢迎来到国民饭店，这是今天的菜单：");
        Food food1 = null;
        Food food2 = null;
        Food food3 = null;
        Food food4 = null;
        Food food5 = null;
        food1 = new Food();
        food2 = new Food();
        food3 = new Food();
        food4 = new Food();
        food5 = new Food();
        food1.number = 1;
        food1.name = "辣子鸡丁";
        food1.tariff = 38;
        food2.number = 2;
        food2.name = "水煮肉片";
        food2.tariff = 22;
        food3.number = 3;
        food3.name = "糖醋里脊";
        food3.tariff = 18;
        food4.number = 4;
        food4.name = "干锅牛肉";
        food4.tariff = 38;
        food5.number = 5;
        food5.name = "干锅排骨";
        food5.tariff = 29;
        food1.tell1();
        food2.tell1();
        food3.tell1();
        food4.tell1();
        food5.tell1();
        System.out.println("请输入想要点的菜的序号并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arr = str.split(",");
        int[] b = new int[arr.length];
        System.out.println("您已经选择了：");
        int sum = 0;
        for (int j = 0; j < b.length; j++) {
            b[j] = Integer.parseInt(arr[j]);
            if (b[j] == 1) {
                System.out.println(food1.name + "\t" + food1.tariff + "元");
                sum += food1.tariff;
            }
            if (b[j] == 2) {
                System.out.println(food2.name + "\t" + food2.tariff + "元");
                sum += food2.tariff;
            }
            if (b[j] == 3) {
                System.out.println(food3.name + "\t" + food3.tariff + "元");
                sum += food3.tariff;
            }
            if (b[j] == 4) {
                System.out.println(food4.name + "\t" + food4.tariff + "元");
                sum += food4.tariff;
            }
            if (b[j] == 5) {
                System.out.println(food5.name + "\t" + food5.tariff + "元");
                sum += food5.tariff;
            }
            if (b[j]>5||b[j]<1){
                System.out.println("您的输入有误");
                break;
            }
        }
        System.out.println("一共" + sum + "元");
        modePayment();
    }

    public static void modePayment() {
        System.out.println("请选择支付方式：\n1.支付宝\n2.微信\n3.刷脸");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1: {
                System.out.println("请出示付款码");
                break;
            }
            case 2: {
                System.out.println("请出示付款码");
                break;
            }
            case 3: {
                System.out.println("正在识别人脸");
                break;
            }
            default: {
                System.out.println("您的输入有误");
                break;
            }
        }
    }
}
