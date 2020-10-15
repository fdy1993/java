/**
 * Guess
 */
import java.util.Random;
import java.util.Scanner;
public class Guess {
public static void main(String[] args) {
    Random randomnumber = new Random();
    int randomnum = randomnumber.nextInt(100) + 1;
    Scanner guess = new Scanner(System.in);
    while (true) {
        System.out.println("请输入你猜的数字：");
        int guessnum = guess.nextInt();
        if (guessnum < randomnum) {
            System.out.println("你猜的数字" +guessnum+ "小了");
        } else if (guessnum>randomnum) {
            System.out.println("你猜的数字" +guessnum+ "大了");
        } else {
            System.out.println("恭喜你猜对了！你才的数字是：" +guessnum);
            break;
        }
    }
    guess.close();
}
    
}