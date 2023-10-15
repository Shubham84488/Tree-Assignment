
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int data) {
        this.key = data;
    }
}
public class Ass5 {
    public static void preorder(Node root)
    {
        if (root == null) {
            return;
        }
 
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void swap(Node root){
        if(root==null){
            return;
        }
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    static void mirrorAns(Node root){
        if(root==null){
            return;
        }
        mirrorAns(root.left); 
        mirrorAns(root.right);

        swap(root);
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        mirrorAns(root);
        preorder(root);
    }
}

