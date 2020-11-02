package lv3;

public class Monstrosity {
    private String[] name = {"骷髅兵1", "骷髅兵2", "女巫（boss）"};
    public int[][] property = {{20, 5, 0,0}, {20, 5, 0,1}, {40, 10, 5,2}};//生命，攻击，防御，编号

    public String[] getName() {
        return name;
    }

    public int[][] getProperty() {
        return property;
    }
    }
