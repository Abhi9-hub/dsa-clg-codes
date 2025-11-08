package recursion.backtracking;


import java.util.ArrayList;

public class nQueen {
     public static int isSafe(int[][] matrix, int row, int col){
        int n = matrix.length;
        int i, j;
        for(i=0; i<n; i++){
            if(matrix[i][col]==1)
            return 0;
        }
        for(i=row-1, j=col-1;  i>=0 && j>=0; i--, j--){
            if(matrix[i][j] == 1)
                return 0;
        }
        for(i=row-1, j=col+1; j<n && i>=0; i--, j++){
            if(matrix[i][j] == 1)
                return 0;
        }
        return 1;
    }
    public static void place(int row, int[][] matrix, ArrayList<ArrayList<Integer>> allResult){
        int n= matrix.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(row == n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    
                    if(matrix[i][j] == 1)
                    res.add(j+1);
                }
            }allResult.add(res);
            return;
        }
        
        for (int i=0; i<n; i++){
            if(isSafe(matrix,row,i) ==1){
                matrix[row][i]=1;
                place(row+1,matrix,allResult);
                matrix[row][i]=0;
            }
        }


    }
    public int totalNQueens(int n) {
        ArrayList<ArrayList<Integer>> allResult = new ArrayList<>();
        int[][] matrix = new int[n][n];
        place(0,matrix,allResult);
        return allResult.size();
    }
}
