class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int c=0;
        Arrays.sort(people);
        boolean vis[]=new boolean[people.length];
        while(l<r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                c++;
                vis[l]=true;
                vis[r]=true;
                l++;
                r--;
            }
            else if(sum<limit){
                l++;
            }
            else{
                r--;
            }
        }
        for(int i=0;i<people.length;i++){
            if(!vis[i] && people[i]<=limit){
                c++;
            }
        }
        return c;
    }
}