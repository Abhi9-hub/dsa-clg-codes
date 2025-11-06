package recursion;

public class countZeros {
    public static int Zeros(int nums){
        if(nums == 0)return 0;
        int rem = nums%10;
        if(rem == 0){
            return 1+Zeros(nums/10);
        }else{
            return Zeros(nums/10);
        }
    }
    public static void main(String[] args) {
        int nums = 102030;
        int res = Zeros(nums);
        System.out.println(res);
    }
}
