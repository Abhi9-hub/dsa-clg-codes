package recursion;

public class sorted {
    public static boolean increasing(int[] arr, int index){
        if(index == arr.length-1)return true;

        boolean strictlyIncreasing = increasing(arr, index+1);
        if(arr[index] < arr[index+1] && strictlyIncreasing){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean res = increasing(arr, 0);
        System.out.println(res);
    }
}
