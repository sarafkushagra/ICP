class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0;
        int c10 = 0;
        int c20 = 0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5) c5++;
            else if(bills[i]==10) {
                c5--;
                c10++;
            }
            else if(bills[i]==20){
                if(c5>=1 && c10>=1){
                    c10--;
                    c5--;
                }
                else{
                    c5-=3;
                }
                c20++;
            }
            if(c5<0 || c10<0 || c20<0) return false;
        }
        return true;
    }
}