package recursion.backtracking;

public class subString {

    public static void subSequence(String st, int index, String result){
        if(index == st.length()){
        System.out.println(result);
        return;
    }
        // sub = st.substring(0, index) + st.substring(index+1);
        //System.out.println(sub);
        // if picking
        //result += st.charAt(index);
        // System.out.println(result);
        subSequence(st, index+1, result+st.charAt(index));
        // if not picking 
        subSequence(st, index+1, result);
        
        
    }
    public static void main(String[] args) {
        String st = "abc";
        subSequence(st, 0, "");
        
    }
}
