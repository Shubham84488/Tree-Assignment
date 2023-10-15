import java.util.ArrayDeque;
import java.util.Queue;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int data) {
        this.key = data;
    }
}
public class Ass2 {

    public static boolean isComplete(Node root){
        Queue<Node> q=new ArrayDeque<>();

        if(root==null){
            return true;
        }
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.remove();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }

            if(temp.left!=null || temp.right!=null){  //To check If there is a node left or right to it 
                if(temp.left==null){
                    return false;
                }
                if(temp.right==null){
                    // Checking if there is a node next to it, if not its good but if exists return false 
                    if(!q.isEmpty()){
                        Node t2=q.peek();
                        if(t2.left!=null || t2.right!=null){ 
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        // root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(11);

        boolean res= isComplete(root);
        System.out.println(res);

    }
    
}

