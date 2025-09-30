class Solution {
    public List<Integer> findAnagrams(String txt, String pat) {
        if(pat.length()>txt.length())
        return new ArrayList<>();
        int patfreq[]=new int[26];
        int txtfreq[]=new int[26];
        int k=pat.length();
        for(int i=0;i<k;i++){
            char nch=pat.charAt(i);
            patfreq[nch-'a']++;
        }
        for(int i=0;i<k;i++){
            txtfreq[txt.charAt(i)-'a']++;
        }
        ArrayList<Integer> count = new ArrayList<>();
        if(Arrays.equals(txtfreq,patfreq)){
            count.add(0);
        }
        int n=txt.length();
        for(int i=1;i<=n-k;i++){
            txtfreq[txt.charAt(i-1)-'a']--;
            txtfreq[txt.charAt(i+k-1)-'a']++;
            if(Arrays.equals(txtfreq,patfreq)){
                count.add(i);
            }
            
        }
        return count;
    }
}