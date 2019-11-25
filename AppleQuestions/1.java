// Question1: given a ternary tree (a tree where it’s possible for each node to have 3 children).
// Given that the value of each node is greater than zero. Implement int findPathSum(node* root,
// node* target) which will return the sum of the nodes between root and target. For example
// between 10 and 1 the sum is 41.


import java.lang.Math; 

import java.util.ArrayList; 

public class HelloWorld
{
  
   public static boolean hasPath(Node root,Node target, ArrayList<Integer> arr)  
    {  
       
        if (root==null)  
            return false;  
          
        arr.add(root.data);      
        
      if(root == target) return true;
  
    
        if (hasPath(root.left,target, arr) ||  
            hasPath(root.mid,target, arr) ||
            hasPath(root.right,target, arr))  
            return true;  
        
         
        arr.remove(arr.size()-1);  
        return false;              
    }  
  
  //----------------------------
  
  
    public static int path(Node root, Node target, int sum)  
    {  
      
        ArrayList<Integer> arr=new ArrayList<>(); 
      
    
        if (hasPath(root,target, arr))  
        {  
          for (int i=0; i<arr.size()-1; i++){      
                System.out.print(arr.get(i)+"->"); 
            	sum = sum +arr.get(i);
          }
            System.out.print(arr.get(arr.size() - 1));
          sum = sum +arr.get(arr.size() - 1);
        }  
        
      
        else
            System.out.print("No Path"); 
      return sum;
    }  
  
  //------------------------------
  
  

  public static void main(String[] args)
  {
    
    System.out.print("hibaaa\n\n");
    
     Node root=new Node(10); 
    Node target;
        root.left = new Node(85); 
    	root.left.left = new Node(31);
   		root.left.mid = new Node(15);
    	root.left.right = new Node(40);
    	root.mid = new Node(30);
    	root.mid.left= new Node(63);
    	root.mid.mid= new Node(1);
    	root.mid.right= new Node(15);
        root.right = new Node(7);  
        
    	target = root.mid.mid;

      int sum =0;
       
    
        sum = printPath(root, target , sum);
        System.out.print("\n\n sum = ");
    System.out.print(sum);
    
    
  }
}

class Node  
{  
    int data;  
    Node left, mid,right;  
    Node(int data) 
    { 
        this.data=data; 
        left=right=mid=null; 
    } 
}; 