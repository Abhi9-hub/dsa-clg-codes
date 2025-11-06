package recursion;

//import java.lang.reflect.Array;

public class reverseArray {
    public static void reverse(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int temp  = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start+1, end-1);
    
    } 
    public static void main(String[] args) {
        int[] arr = {5,45,78,14,12};
        reverse(arr, 0, arr.length-1);
        //System.out.println(Array.toString(arr));
        
    }
}
