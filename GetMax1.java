public class GetMax1 {
    public static void main(String[] args) {
        int result = getMax(20, 30);
        System.out.println(result);
    }
    public static int getMax(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
}
