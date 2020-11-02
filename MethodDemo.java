public class MethodDemo {
    public static void main(String[] args) {
        // 定义一个方法判定一个参数是否是偶数
        int n = 5;
        isEvenNumber(n);
    }
    public static void isEvenNumber(int Number) {
            if (Number%2 == 0) {
                System.out.println("偶数");
            } else {
                System.out.println("不是偶数");
            }
    }
}
