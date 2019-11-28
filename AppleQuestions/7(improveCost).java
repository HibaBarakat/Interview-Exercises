// Q2:

// 15^i >> can be solved using multiplication
// 5o*i >> can be solved using addition 
// i % d >> solved by bitwise if d is power of two,  (i & (d-1))
//          else if d not power of two it can be solved by using 
//          temp variable and eachtime add the temp variable 


//************************************

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Test{

	    
	public static void main(String[] args) {
		Scanner myInput = new Scanner( System.in );
		System.out.print( "Enter an integer: " );
		int i = myInput.nextInt();
		System.out.print(power(15,i)+multiply(50,i)+mod(i,4));
		
	}
	
	  public static int multiply(int a, int b) {
	
		  int result =0;
		  for(int i = 1; i<= a; i++) {
			  result+=b;
		  }
		  return result;
	  }
	  
	  public static int power(int a, int n) {
		  
		  int result = 1;
		  for(int i = 1; i<=n;i++) {
			  result*=a;
		  }
		  return result;
	  }
	  
	  public static int mod(int a, int n) {
		  int result = 1;
		  if(powerOf2(n)) {
			  result = a & (n-1);
			  return result;
		  }
		  
		  
		  return -1;
	  }
	  
	  private static boolean powerOf2(int number){
		  if(number<=0){
		   return false;
		  }
		  
		  while(number > 1){
		   if(number % 2 != 0){
		    return false;
		   }
		   number = number / 2;
		  }
		  return true;
		 }
	


}



