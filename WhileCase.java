/**
 * 案例：纸张厚度0.1mm，对折厚度*2，求对折多少次厚度大于8844430mm
 */

public class WhileCase {
    public static void main(String[] args) {
        int i = 0;
        double z = 0.1;
        while (z<=8844430) {
            z = z*2;
            i +=1;
        }
        System.out.println("0.1mm纸张折叠" +i + "次后纸张厚度大于8844430");
    }
    
}
