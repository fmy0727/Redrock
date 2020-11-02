package lv3;

import java.util.ArrayList;
import java.util.Scanner;

class Finght {
    public void finght(Role role) {
        System.out.println("战斗开始");
        Monstrosity monstrosity = new Monstrosity();
        ArrayList<Integer> life = new ArrayList<>();
        life.add(role.getLife());
        life.add(role.getAttack());
        life.add(role.getDefense());
        life.add(role.getLife());//总血，攻击，防御，当前血
        ArrayList<Integer> atk=new ArrayList<>();
        for (int i = 0; i < monstrosity.getProperty().length; i++) {
            atk.add(harm(role.getAttack(), monstrosity.getProperty()[i][2]));
        }//主角对怪的伤害
        ArrayList<Integer> atk0=new ArrayList<>();
        for (int i = 0; i < monstrosity.getProperty().length; i++) {
            atk0.add(harm(monstrosity.getProperty()[i][1], role.getDefense()));
        }//怪对主角伤害
        ArrayList<Integer> pro = new ArrayList<>();
        for (int i = 0; i < monstrosity.getProperty().length; i++) {
            for (int j = 0; j < 4; j++) {
                pro.add(monstrosity.getProperty()[i][j]);
            }
            pro.add(monstrosity.getProperty()[i][0]);
        }//怪(总血，攻击，防御，编号，当前血）
        for (int i = 1; life.get(1) > 1 && max(pro) > 1; i++) {
            for (int j = 0; j < 45; j++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.println("第" + i + "回合");
            System.out.print(role.getName() + "血:");
            put(life.get(0), life.get(3));
            System.out.println();
            System.out.println();
            for (int k = 0; pro.size() / 5 > k; k++) {
                System.out.print(monstrosity.getName()[pro.get(k * 5 + 3)]);
                put(pro.get(k * 5 + 4), pro.get(k * 5));
                System.out.println();
            }
            for (int j = 0; j < 45; j++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.println("请选择攻击方式");
            System.out.println("1.普攻 2.群攻 3.提升攻击 4.提升防御");
            Scanner sc =new Scanner(System.in);
            int n1=sc.nextInt();
            switch (n1){
                case 1:{
                    System.out.println("请选择攻击目标");
                    for (int j = 0; j < monstrosity.getName().length; j++) {
                        System.out.println(j+1+"."+monstrosity.getName()[j]);
                    }
                    Scanner sc1 =new Scanner(System.in);
                    int n2=sc1.nextInt();
                    pro.set(n2*5-1,pro.get(n2*5-1)-atk.get(n2-1));
                }
            }
        }
    }

    public static int harm(int a,int b) {
        int temp = 1;
        if (a - b > 0) {
            temp = a - b;
        }
        return temp;
    }//伤害计算

    public static int max(ArrayList<Integer> a) {
        int max = a.get(4);
        for (int i = 1; a.size() / 5 > i; i++) {
            if (a.get(i * 5 - 1) > max) {
                max = a.get(i);
            }
        }
        return max;//血最大值
    }

    void put(int a, int b) {//剩血，总血
        int c = a / 5;
        int d = b / 5;
        int e = d - c;
        if (a > 0) {
            for (int i = 0; i < c; i++) {
                System.out.print("■");
            }
            for (int i = 0; i < e; i++) {
                System.out.print("□");
            }
            System.out.print("\t" + a + "/" + b);
        } else {
            for (int i = 0; i < d; i++) {
                System.out.print("□");
            }
            System.out.print( "\t0" + "/" + b);
        }
    }//打印血条
}
