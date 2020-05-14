
public class TestProgram {
	public int lengthOfLongestSubstring(String s) {
        char charElement[]= new char[256];
        int resultBuff = 0;
        int result = 0;
        if(s.length() == 0) return 0;
        char charArray[] = s.toCharArray();
        for(int i = 0, j = 0 ;  i < charArray.length; i++){
            while(charElement[charArray[j]] == 0){
                resultBuff++;
                
                charElement[charArray[j]] = 1;
                if(j == charArray.length - 1) break;
                else j++;
            }
            result = resultBuff > result ? resultBuff : result;
            charElement[charArray[i]]--;
            resultBuff--;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProgram tp = new TestProgram();
		String s = "Happy New Year";
		System.out.println(tp.lengthOfLongestSubstring(s));
		int a[] = new int[100];
        a['a'] = '1';
        System.out.printf("%d\n", a['a']);
		
		
		
		
	}

}
