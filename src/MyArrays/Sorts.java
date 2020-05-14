package MyArrays;

import java.util.Arrays;

public class Sorts {
	
	public static void bubbleSort(int [] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1;j < arr.length;j++){
				if(arr[j] < arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void insertionSort(int [] arr){
		for(int i = 1; i<arr.length;i++){
			for(int j=i; j> 0;j--){
				if(arr[j]<arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			for(int  j= i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex])
					minIndex =j;
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int [] arr,int start, int end){
		if(start<end){
			int pivot = findPivot(arr, start, end);
			quickSort(arr,start, pivot-1);
			quickSort(arr,pivot+1,end);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int findPivot(int [] arr, int start, int end){
		int pivot = arr[end];
		int i = start;
		for(int j = start; j<end;j++){
			if(arr[j] < pivot){
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				
			}
		}
		arr[end] = arr[i];
		arr[i]=pivot;
		return i;
	}
	
	public static void mergeSort(int [] arr, int start, int end){
		if(start <end){
			int mid = (start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			mergeArrays(arr,start, mid+1, end);
			
		}
	}
	
	public static void mergeArrays(int [] arr, int startOne, int startTwo, int endTwo){
		int[] resultArray = new int[endTwo-startOne +1];
		int endOne = startTwo-1;
		
		
		
		int index = 0;
		
		
		
		while(startOne<=endOne && startTwo<=endTwo){
			if(arr[startOne]<=arr[startTwo])
				resultArray[index++] = arr[startOne++];
			else 
				resultArray[index++] = arr[startTwo++];
		}
		
		while(startOne<=endOne){
			resultArray[index++] = arr[startOne++];
		}
		
		while(startTwo<=endTwo){
			resultArray[index++] = arr[startTwo++];
		}
		
		System.out.println(Arrays.toString(resultArray));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,15,7,5,3};
		
		
		System.out.println("original array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Bubble sort");
		//bubbleSort(arr);
		System.out.println("Insertion sort");
		//insertionSort(arr);
		System.out.println("selection sort");
		selectionSort(arr);
		System.out.println("quickSort");
		int end = arr.length-1;
		//quickSort(arr,0,end);
		System.out.println("quickSort");
		
		//mergeSort(arr,0,end);
		

	}

}
