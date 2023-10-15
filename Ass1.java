import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int data) {
        this.key = data;
    }
}
 
public class Ass1
{
    
    public static List<Integer> spiralOrderTraversal(Node root)
    {
        Stack<Node> s1= new Stack<>();
        Stack<Node> s2= new Stack<>();
        List<Integer> res= new LinkedList<>();

        s1.add(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            while(!s1.isEmpty()){
                Node temp=s1.pop();
                res.add(temp.key);
                if(temp.left!=null){
                    s2.add(temp.left);
                }
                if(temp.right!=null){
                    s2.add(temp.right);
                }
            }
            while(!s2.isEmpty()){
                Node temp=s2.pop();
                res.add(temp.key);
                if(temp.right!=null){
                    s1.add(temp.right);
                }
                if(temp.left!=null){
                    s1.add(temp.left);
                }  
            }
        }

        return res;
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        root.right.right.left = new Node(2100);
        root.right.right.right = new Node(80);
        root.right.right.right.left = new Node(341);
        root.right.right.right.right = new Node(22);
 
        List<Integer> res= spiralOrderTraversal(root);
        System.out.println(res);
    }
}