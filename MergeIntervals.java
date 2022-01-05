class Solution {
    public int[][] merge(int[][] intervals) {
        //creating list of arrays 
        List<int[]> res = new ArrayList<>();
        //checking base case 
        if(intervals.length == 1 || intervals == null) {
            res.toArray(new int[0][]);
        }
        //sort the intervals 
        Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
        //store the start time and end time 
        int start = intervals[0][0] , end = intervals[0][1];
        //iterate over the intervals 
        for(int i=1; i<intervals.length; i++) {
            //checking the start time of next interval is greater the previous end 
            if(intervals[i][0] > end) {
                res.add(new int[]{start , end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            // if no then there is possibility that current interval will merge with the previous one
            else if(intervals[i][1] >= end) {
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start ,end});
        return res.toArray(new int[0][]);     
    }
}
