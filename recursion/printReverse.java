package recursion;

public class printReverse {

    
    public static void printreverse(int[] arr, int index) {
        if (index == arr.length) return;

        
        printreverse(arr, index + 1);

        
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {5, 45, 78, 14, 12};
        printreverse(arr, 0);
    }
}
