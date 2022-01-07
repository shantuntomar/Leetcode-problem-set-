class FindMissingAndRepeatingElement  {
	public static void main(String[] args) {
		int[] arr = {2,4,1,2,5};
		int[] res = find(arr);
		for(int ele : res) System.out.println(ele + " ");
	}
	public static int[] find(int[] arr) {
		int[] res = new int[2];
		for(int i=0; i<arr.length; i++) {
			if(arr[Math.abs(arr[i])-1] < 0) arr[0] = Math.abs(arr[i]);
			else arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
		}
	}
	for(int i=0; i<arr.length; i++) {
		if(arr[i] > 0) arr[1] = i+1;
	}
	return res
}
