// How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class Test{

	public static void main(String[] args) {

		
		int[] arr = getRandomArray(7);
		findPairs(arr, 10);
		
	}
	
	public static void findPairs(int[] array, int target){
		Set<Integer> set = new HashSet<>();
		for (int v : array) {
		    set.add(v);
		}
		for(int i : set) {
			int num = target - i;
			if(set.contains(num)) {
				System.out.println("("+i+","+num+")");
			}
		}
		
		
	}
	
	public static int[] randomArray(int length){
		int[] randoms = new int[length];
		
		for(int i=0; i<length; i++){ 
			randoms[i] = (int) (Math.random()*15); 
			}
		return randoms; 
		}


	

}



