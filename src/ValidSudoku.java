import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	/*
	 * Leet code problem #36
	 */
	
//	public boolean isValid(char [][] board){
//		
//		
//		for(int i = 0; i < 9; i++){
//			Set<Character> rowSet = new HashSet<Character>();
//			Set<Character> colSet = new HashSet<Character>();
//			Set<Character> cubeSet = new HashSet<Character>();
//			for(int j=0; j < 9; j++){
//				
//				if(board[i][j]!='.'&&!rowSet.add(board[i][j]))
//					return false;
//				
//				if(board[j][i]!='.'&&!colSet.add(board[j][i]))
//					return false;
//				int rowIndex = 3*(i/3);
//				int colIndex = 3*(i%3);
//				if(board[rowIndex+ (j/3)][colIndex+(j%3)]!='.'&& !cubeSet.add(board[rowIndex+(j/3)][colIndex+(j%3)]))
//					return false;
//
//			}
//		}
//		return true;
//	}
	
	public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char val = board[row][col];
                if (val != '.') {
                    int block = (row / 3 * 3) + (col / 3);
                    if (set.contains("r" + row + val) || 
                        set.contains("c" + col + val) ||
                        set.contains("b" + block + val))
                        return false;
                    else {
                        set.add("r" + row + val);
                        set.add("c" + col + val);
                        set.add("b" + block + val);
                    }   
                }
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this board is for valid case '
		char [][] board = {
		                   {'5','3','.','.','7','.','.','.','.'},
		                   {'6','.','.','1','9','5','.','.','.'},
		                   {'.','9','8','.','.','.','.','6','.'},
		                   {'8','.','.','.','6','.','.','.','3'},
		                   {'4','.','.','8','.','3','.','.','1'},
		                   {'7','.','.','.','2','.','.','.','6'},
		                   {'.','6','.','.','.','.','2','8','.'},
		                   {'.','.','.','4','1','9','.','.','5'},
		                   {'.','.','.','.','8','.','.','7','9'}
		                 };
		
		//this board is for 'not valid' case- there are two eights in the top left 3x3 box'
				char [][] board2 = {
				                   {'8','3','.','.','7','.','.','.','.'},
				                   {'6','.','.','1','9','5','.','.','.'},
				                   {'.','9','8','.','.','.','.','6','.'},
				                   {'8','.','.','.','6','.','.','.','3'},
				                   {'4','.','.','8','.','3','.','.','1'},
				                   {'7','.','.','.','2','.','.','.','6'},
				                   {'.','6','.','.','.','.','2','8','.'},
				                   {'.','.','.','4','1','9','.','.','5'},
				                   {'.','.','.','.','8','.','.','7','9'}
				                 };
		
		
		
		
		ValidSudoku vs = new ValidSudoku();
//		System.out.println(vs.isValid(board));
//		System.out.println(vs.isValid(board2));
		
		System.out.println(vs.isValidSudoku(board));
        System.out.println(vs.isValidSudoku(board2));
		
		

	}

}
