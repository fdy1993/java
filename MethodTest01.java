public class MethodTest01 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 105, 55};
        int a = getMax(arr);
        System.out.println("最大值是："+ a);   
    }
    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
}
}
