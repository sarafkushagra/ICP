class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        ArrayList<Integer> a =  new ArrayList<>();
        
        int left = 0 , top  = 0 , bottom = r-1, right = c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                a.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                a.add(arr[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                a.add(arr[i][left]);
            }
            left++;}
        }
        return a;
    }
}