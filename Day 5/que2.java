class Solution {
    public int eraseOverlapIntervals(int[][] points) {
        int length = points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int prev = points[0][1];
        int res = 0;
        for(int i=1;i<length;i++){
            if(points[i][0]< prev){
                res++;
            } 
            else{
                prev = points[i][1];
            }
        }
        return res;
    }
}