class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue queue = new LinkedList<>();
        int result = 0;
        for (char c : s.toCharArray()) {
                while (queue.contains(c)) { 
                    queue.poll();
                }
                queue.offer(c);
                result = Math.max(result, queue.size());
        }
        return result;
    }
}
