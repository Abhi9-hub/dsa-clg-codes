package recursion;

public class counts_digit {
    
    public static int countDigit(int n){
        if (n==0)return 0;

        
        return 1+ countDigit(n/10);
    }

    public static void main(String [] args){
        int res = countDigit(4875947);
        System.out.println(res);
    }
}
