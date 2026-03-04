class Solution {
    public int checkRowAndCol(int[][] mat, int row, int col){
        for(int i = 0; i < mat.length; i++){
            if(i != row && mat[i][col] == 1){
                return 0;
            }//hello
        }
        for(int j = 0; j < mat[row].length; j++){
            if(j != col && mat[row][j] == 1){
                return 0;
            }
        }
        return 1;
    }
    public int numSpecial(int[][] mat) {
        int uniquePositions = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    uniquePositions += checkRowAndCol(mat, i, j);
                }
            }
        }
        return uniquePositions;
    }
}