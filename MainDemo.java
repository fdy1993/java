public class MainDemo {
    public static void main(String[] args) {
        int [] arr = {1, 56, 123, 556, 88, 100};
        int min = arr[0];
        for(int i = 1; i< arr.length;i+=1){
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
