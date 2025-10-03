
class Solution {
    public void combination(int index,int target,int[] candidate,List<List<Integer>> ans,List<Integer> ds){
        
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i= index;i<candidate.length;i++){
            if(i>index && candidate[i]==candidate[i-1]) continue;
            if(candidate[i]>target) break;

            ds.add(candidate[i]);
            combination(i+1,target-candidate[i],candidate,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,target,candidates,ans,ds);
        return ans;
    }
}