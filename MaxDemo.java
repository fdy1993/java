public class MaxDemo {
    public static void main(String[] args) {
        int [] arr = {1, 56, 123, 556, 88, 100};
        int max = arr[0];
        for (int i = 1; i<arr.length; i +=1) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
