class Solution {
    public void helper(int idx,List<List<Integer>> res,List<Integer> l , int n,int k){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx;i<=n;i++){
            l.add(i);
            helper(i+1,res,l,n,k);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        helper(1,res,l,n,k);
        return res;
    }
}