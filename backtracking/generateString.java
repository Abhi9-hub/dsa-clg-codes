package recursion.backtracking;

import java.util.ArrayList;

public class generateString {


    public static void Helper(int n, int i, String res, ArrayList<String> allRes){
        if(i == n ){
            allRes.add(res);
            return;
        };

        Helper(n, i+1, res+"0",allRes);
        
        // if(i != 0 && res.charAt(i-1) != 1){
        //     res = res.substring(0,res+1);
        // }
        Helper(n, i+2, res+"1", allRes);

    
    }


    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> allRes = new ArrayList<>();
        Helper(n, 0, "", allRes);
        System.out.println(allRes);
    }
}
