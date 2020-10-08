public class ForDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 1 ) {
            if (i % 2 == 0) {
                sum += i;            
            }
        }
        System.out.println("1-100的和：" + sum);
    }
}
