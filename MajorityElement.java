import java.util.*;

class MajorityElement {

	public static int majorityElement(int[] nums) {

		//MOORE'S VOTING ALGORITHM : 
		int count = 0;
		int candidate = 0;
		for(int ele : nums) {
			if(count == 0) candidate = ele;
			if(ele == candidate) count+=1;
			else count-=1;
		}
		return candidate;
	}

	public static void main(String[] args) {

		int[] arr = {3,2,3};
		int ans = majorityElement(arr);
		System.out.println(ans);
	}
}
