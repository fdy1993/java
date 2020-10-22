public class MethodTest {
    public static void main(String[] args) {
        int [] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }
    // public static void printArr(int[] arr) {
    //     for (int x=0; x<arr.length; x++) {
    //         System.out.println(arr[x]);
    //     }
    // }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int x=0; x<arr.length; x++) {
            if (x==arr.length-1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x]+", ");
            }
            
        }
        System.out.print("]");
    }

}
