import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int data) {
        this.key = data;
    }
}

public class Ass3 {

    public static void reversalLevel(Node root){
        Queue<Node> q= new ArrayDeque<>();
        Stack<Integer> res=new Stack<>();

        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            res.add(temp.key);

            
            if(temp.right!=null){
                q.add(temp.right);
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
        }

        while(!res.isEmpty()){
            System.out.print(res.pop()+" ");
        }
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        root.left.left.left=new Node(7);
        root.left.left.right=new Node(8);

        reversalLevel(root);
    }
}

