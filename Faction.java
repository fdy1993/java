

/**
 * 定一个方法并调用方法，比较两个数字的大小
 */
public class Faction {
    public static void main(String[] args) {
        getMax();
    }
    public static void getMax() {
        int a=10;
        int b=26;
        int max;
        if (a>b) {
            max=a;
        } else {
            max=b;
        }
        System.out.println("a和b最大的数是："+max);
    }
}