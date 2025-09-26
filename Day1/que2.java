class que2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        int res[] = new int[l-k+1];
        // for(int i=0;i<=l-k;i++){
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         max = Math.max(max,nums[j]);
        //     }
        //     res[i]=max;
        // }
        // return res;
        int idx=0;
        Deque<Integer> max = new ArrayDeque<>();
        for(int i=0;i<l;i++){
            if(!max.isEmpty() && max.peekFirst()<=i-k)
            max.pollFirst();
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[i])
            max.pollLast();
            max.offerLast(i);

            if(i>=k-1){
                res[idx] = nums[max.peekFirst()];
                idx++;
            }
        }
        return res;
    }
}