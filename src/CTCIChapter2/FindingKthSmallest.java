package CTCIChapter2;

public class FindingKthSmallest {
	
	
	public static int findKthSmallest(int [] arr, int start, int end, int k){
		
		if(k <1 || k > end -start+1)
			throw new IndexOutOfBoundsException();
		
		//if(k>0 && k <= end-start+1){
			int pivot = partition(arr,start,end);
			if(pivot == k-1)
				return arr[pivot];
			else if (pivot > k-1)
				return findKthSmallest(arr, start, pivot-1,k);
			else 
				return findKthSmallest(arr, pivot+1, end,k);
		
		//} 
		//return -1;			
	
	}
	
	public static int partition(int[] arr , int start, int end){
		int pivot = arr[end];
		int i = start;
		for(int j = start; j< end; j++){
			if(arr[j]  <= pivot){
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				i++;
			}
			

		}
		arr[end] = arr[i];
		arr[i] = pivot;
		return i;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 7, 10, 4,3,5,15,20};
		System.out.println(findKthSmallest(arr, 0, arr.length-1,8));
		

	}

}
