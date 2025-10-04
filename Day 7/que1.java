class Solution {
    void helper(int[] arr,int[] res,int k){
        if(k>=arr.length) return;
        if(k==0)
        res[k]=arr[k];
        else if(k==1)
        res[k]=Math.max(arr[k],res[k-1]);
        else
        res[k]=Math.max(arr[k]+res[k-2],res[k-1]);
        helper(arr,res,k+1);
    }
    public int rob(int[] arr) {
        int l = arr.length;
        int[] res = new int[l];
        helper(arr,res,0);
        return res[l-1];
    }
}