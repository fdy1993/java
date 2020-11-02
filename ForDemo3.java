/**
 * 输出100-999的水仙花数
 * 水仙花：个、十、白位的数字之和原数
 */
public class ForDemo3 {
    public static void main(String[] args) {
        for (int i=100; i<1000; i +=1) {
            int g = i%10;
            int s = i/10%10;
            int b = i/10/10%10;
            if (g*g*g + s*s*s + b*b*b == i) {
                System.out.println("水仙花数是："+i);
            }
        }        
    }
}
