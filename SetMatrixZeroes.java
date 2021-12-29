class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length , col = matrix[0].length;
        Set<Integer> store_rows = new HashSet<>();
        Set<Integer> store_cols = new HashSet<>();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == 0) {
                    store_rows.add(i);
                    store_cols.add(j);
                }
            }
        }
        //iterate the matrix 
        for(int i=0; i<rows; i++) {
            for(int j=0; j<col; j++) {
                if(store_rows.contains(i) || store_cols.contains(j)) matrix[i][j] = 0;
            }
        }
        
    }
}
