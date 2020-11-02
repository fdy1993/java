import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random i = new Random();
        int num = i.nextInt(10);
        System.out.println(num);
    }
}
