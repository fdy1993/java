public class MethodDemo1 {
    public static void main(String[] args) {
        // isEvenNumber(10);
        boolean flag = isEvenNumber(10);
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number) {
        if (number%2==0) {
            return true;
        } else {
            return false;
        }
    }
}
