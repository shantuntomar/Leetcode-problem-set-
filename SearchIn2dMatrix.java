class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rows = 0 , col = m-1;
        while(rows < n && col >= 0) {
            if(matrix[rows][col] == target) return true;
            if(matrix[rows][col] < target) rows++;
            else col--;
        }
        return false;
        
    }
}
