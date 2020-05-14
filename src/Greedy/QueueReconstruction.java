package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {
	
	public int[][] reconstructQueue(int[][] people) {
	    int[][] result = new int[people.length][];
	    Arrays.sort(people, new Comparator<int[]>(){
	        public int compare(int[] a1, int[] a2){
	            if(a1[0]!=a2[0]){
	                return a2[0]-a1[0];
	            }else{
	                return a1[1]-a2[1];
	            }
	        }
	    });
	 
	    ArrayList<int[]> list = new ArrayList<int[]>();
	 
	    for(int i=0; i<people.length; i++){
	        int[] arr = people[i];
	        list.add(arr[1],arr);
	    }
	 
	    for(int i=0; i<people.length; i++){
	        result[i]=list.get(i);
	    }
	 
	    return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] people = {
				{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}
				
		};
		
		QueueReconstruction qr = new QueueReconstruction();
		int[][] result = qr.reconstructQueue(people);
		for(int[] arr :  result)
			System.out.println(Arrays.toString(arr));

	}

}
