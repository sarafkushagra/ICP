class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcount = Integer.MIN_VALUE;
        int l = s.length();
        if(l==0)
        return 0;
        int i = 0;
        int j = 0;
        while(j<l){
            HashSet<Character> set = new HashSet<>();
            String res ="";
            for(int k=i;k<=j;k++){
                res+= s.charAt(k);
                set.add(s.charAt(k));
            }
            if(set.size()==res.length())
            {
                j++;
            }
            else{
                i++;
            }
            maxcount = Math.max(maxcount,(j-i));
        }
        return maxcount;
    }
}