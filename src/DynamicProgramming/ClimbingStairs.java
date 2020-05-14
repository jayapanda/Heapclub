package DynamicProgramming;

public class ClimbingStairs {
	
		public int climbStairs(int n){
			if(n<=0) return 0;
			if(n==1) return 1;
			if(n==2) return 2;
			
			int n_1 = 2;
			int n_2 = 1;
			int res = 0;
			for(int i = 3; i <=n; i++){
				res = n_2 + n_1;
				n_2= n_1;
				n_1 =res;
				
			}
			return res;
			
			
		}
	
		
//	    public int climbStairs(int n) {
//	    	int [] result = new int[n+1];
//	      
//	       
//	            result[0] = 0;
//	     
//	           result[1] = 1;
//	       
//	           result[2] = 2;
//	        
//	       
//	        
//	        for(int i = 3 ; i <= n ; i++){
//	            
//	            result[i] = result[i-1]+result[i-2];
//	            System.out.println(result[i]);
//	        }
//	            
//	       
//	        
//	        return result[n];
//	        
//	    }
	
	     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs cs = new ClimbingStairs();
		System.out.println(cs.climbStairs(100));

	}

}
