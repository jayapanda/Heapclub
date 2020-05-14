package MyArrays;

public class RunLengthEncoding {
	
	public static void countChars(String str){
		int i=0;
		StringBuilder sb = new StringBuilder();
		while(i<str.length()){
			char c = str.charAt(i);
			int count =0;
			while (i<str.length() && str.charAt(i) == c){
				i++;
				
				count++;
			}
			if(count!=1){
				
				sb.append(c+Integer.toString(count));
			} else
				sb.append(c);
			
		}
		System.out.println(sb.toString());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabbcccccdee";
		countChars(str);

	}

}
