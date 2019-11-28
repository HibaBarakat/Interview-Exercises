import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;



public class Test{

	 final static int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 }; 
     final static int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 }; 
     final static int ROW = 5;
     final static int COL = 5;
	public static void main(String[] args) {

		
	}
	
	   static boolean isSafe(int M[][], int row, int col,boolean visited[][]) 
{ 
    // row number is in range, column number is in range 
    // and value is 1 and not yet visited 
    return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]); 
} 
	
	static void DFS(int M[][], int row, int col, boolean visited[][]) {
		visited[row][col] = true; 
		for(int i = 0; i< 8; i++) {
			if(isSafe(M,row+rowNbr[i],col+colNbr[i],visited)) {
				DFS(M, row + rowNbr[i], col + colNbr[i], visited); 
			}
		}
	}
	
	public static void numberOfIslands(int M[][]) {
		
		boolean[][] visited = new boolean[ROW][COL];
		
		int count = 0;
		for(int i=0; i<ROW;i++) {
			for(int j=0; j<COL;j++) {
				if(M[i][j] == 1 && !visited[i][j]) {
					DFS(M,i,j, visited);
					count ++;
				}
			}
		}
	}
	

	


}



