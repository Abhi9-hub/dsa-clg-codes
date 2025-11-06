package recursion;

public class intInString {
    public static boolean integer(String var, int index){
        if(index == var.length()){
            return true;
        }
        char ch = var.charAt(index);
        if (ch < '0' || ch > '9'){
            return false;
        }
        return integer(var, index+1);
        
    }
    public static void main(String[] args) {
        String var = "12345";
        boolean res = integer(var, 0);
        System.out.println(res);
    }
}
