package recursion;

public class max_no_in_array {
    public static int max_Array(int[] array, int index ){
        if(index == array.length - 1){
            return array[index];
        }
        
        int maxArray = max_Array(array, index+1); 
        if(array[index] > maxArray){
            return array[index];
        }else{
            return maxArray;
        }
        
    }

    public static void main(String[] args) {
        int[] Array = {3,7,8,9,12,5};
        int res = max_Array(Array, 0);
        System.out.println(res);
    }
}
