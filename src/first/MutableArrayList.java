package first;

import java.util.ArrayList;
import java.util.Collections;

public class MutableArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("红岩网校");
        list.add("加油冲冲冲！！！");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("加油冲冲冲！！！");
        int a = 0;
        if (a < list.size()) {
            list.remove(a);
        }
        list.add("张涛学长好漂亮");
        list.set(0, "张涛学姐好漂亮!!!");
        System.out.println(list);
        list.add("2");
        list.add("1");
        list.add("3");
        list.trimToSize();
        Collections.sort(list);
        System.out.println(list);
        System.out.println("list内拥有" + list.size() + "个元素");
    }
}
