class Solution {
    public int findDuplicate(int[] nums) {
        //create set to stote only distinct element 
        Set<Integer> st = new HashSet<>();
        //iterate over the array 
        for(int ele : nums) {
            // check our set is contain that element or not 
            if(st.contains(ele)) return ele;
            else st.add(ele);
        }
        return -1;
    }
}
