package nodes;

public class GridNode {

    Node root; 
  
    // Constructors 
    GridNode(int key) 
    { 
        root = new Node(key); 
    } 
  
    GridNode() 
    { 
        root = null; 
    } 
  
    public static void main(String[] args) 
    { 
    	GridNode tree = new GridNode(); 
  
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
    } 
}
