public class Solution {
    public static long getInversions(long arr[], int n) {
        int[] temp = new int[arr.length];
        int ans = mergeSort(arr,temp,0,arr.length-1);
        return ans;
    }
    public static int mergeSort(long[] arr , int[] temp , int lo , int high) {
        int invCount = 0;
        if(high > lo) {
            int mid = (lo+high)/2;
            invCount += mergeSort(arr , temp , lo , mid);
            invCount += mergeSort(arr , temp , mid+1 , high);
            invCount += merge(arr , temp , lo , mid+1 , high);
        }
        return invCount;
    }
    public static int merge(long[] arr , int[] temp , int lo , int mid , int high) {
        int invCount = 0 , i = lo , j = mid , k = lo;
        while((i <= mid-1) && (j <= high)) {
            if(arr[i] <= arr[j]){
                temp[k++] = (int)arr[i++];
            }
            else {
                temp[k++] = (int)arr[j++];
                invCount = invCount + (mid - i);
            }
   		}
        while(i <= mid - 1) temp[k++] = (int)arr[i++];
        while(j <= high) temp[k++] = (int)arr[j++];
        for(i = lo; i <= high ; i++) arr[i] = temp[i];
        
        return invCount;
        
    }
    
    
}
