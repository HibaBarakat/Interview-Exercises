
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
  private List<Integer> list = new ArrayList<>();
  public TreeNode increasingBST(TreeNode root) {
     
      traverseTree(root);
      TreeNode increasingTree = new TreeNode(list.get(0));
      TreeNode curr = increasingTree; 
      
      for(int i=1; i< list.size(); i++){
          curr.right = new TreeNode(list.get(i));
          curr = curr.right;
      }
      return increasingTree;
      
      
      
  }
  
  public void traverseTree(TreeNode root){
      if (root == null) return;
      
      traverseTree(root.left);
      list.add(root.val);
      traverseTree(root.right);
  }
}