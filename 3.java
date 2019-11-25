import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> pairSet = new HashSet<>();

        for(int k = 0; k<t ; k++){
        pairSet.add(pair_left[k]+pair_right[k]);
        System.out.println(pairSet.size() );

        }


    }
}


// *************************** Solution Two ********************

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;


// public class HashSets {

// 	 Set<String> pairsSet = new HashSet<>();
// 		public static void main(String[] args) {
// 		System.out.print( "Enter Two pairs" );
//         Scanner s = new Scanner(System.in);
//         int t = s.nextInt();
//         String [] pair_left = new String[t];
//         String [] pair_right = new String[t];
//         Set<Pair> pairSet = new HashSet<>();
//         for (int i = 0; i < t; i++) {
        	
//             pair_left[i] = s.next();
//             System.out.print( pair_left[i] );
//             pair_right[i] = s.next();
//             System.out.print( pair_right[i] );
            
//             Pair pair = new Pair(pair_left[i],pair_right[i] );
//             pairSet.add(pair);
//             System.out.println(pairSet.size() );
//         }

// 	}

// }


// public class Pair{
//     String a;
//     String b;
//     Pair(String p,String q){
//         a=p;
//         b=q;
//     }
