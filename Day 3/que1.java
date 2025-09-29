class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row-1;
        int rn = 0;
        while(top<=bottom){
            int mid = (top+bottom)/2;
            if(matrix[mid][0]<=target && matrix[mid][col-1]>=target){
                rn=mid;
                break;
            }
            else if(matrix[mid][0] > target){
                bottom = mid-1;
            }
            else{
                top = mid+1;
            }
        }
        int low = 0;
        int high = col-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(matrix[rn][mid]==target)
            return true;
            else if(matrix[rn][mid]>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return false;
    }
}