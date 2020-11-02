public class GetMax {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        getMax(a, b);
    }
    public static void getMax(int a, int b) {
        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
