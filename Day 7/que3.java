class Solution {
    // public int helper(int cc,int cr,int er,int ec){
    //     if(cr==er && cc==ec)
    //     return 1;
    //     if(cc<0 || cr<0 || cc>ec || cr>er)
    //     return 0;
    //     int right = helper(cc+1,cr,er,ec);
    //     int down = helper(cc,cr+1,er,ec);
    //     return right+down;
    // }
    public int helper(int cc,int cr,int er,int ec,int[][] dp){
        if(cr==er && cc==ec)
        return 1;
        if(cc<0 || cr<0 || cc>ec || cr>er)
        return 0;
        if(dp[cr][cc]!=0) return dp[cr][cc];
        int right = helper(cc+1,cr,er,ec,dp);
        int down = helper(cc,cr+1,er,ec,dp);
        dp[cr][cc]=right+down;
        return right+down;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return helper(0,0,m-1,n-1,dp);
    }
}