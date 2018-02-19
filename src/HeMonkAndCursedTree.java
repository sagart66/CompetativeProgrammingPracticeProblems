import java.util.Scanner;

public class HeMonkAndCursedTree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        BST b=new BST();
        for(int i=0;i<n;i++)
            b.insert(input.nextInt());
     //   b.preorder();
        System.out.println(b.output(input.nextInt(),input.nextInt()));
    }
}
class BST{
    Node root;
    BST(){
        root=null;
    }

    void insert(int d){
       root= insert(root,d);
    }

    Node insert(Node node,int a){
        if(node==null)
            node=new Node(a);
        else if(node.data>a)
           node.left= insert(node.left,a);
        else if(node.data<a)
           node.right= insert(node.right,a);
        return node;
    }


    Node findLca(Node node,int v1,int v2){
        if(node==null)
            return null;
        if(node.data==v1 || node.data==v2)
            return node;
        Node l=findLca(node.left,v1,v2);
        Node r=findLca(node.right,v1,v2);

        if(l!=null && r!=null)
            return node;
        if(l!=null)
            return l;
        return r;
    }




    int output(int v1,int v2){
        Node n=findLca(root,v1,v2);

            int k=(v1>v2)?v1:v2;
            return find(n,k);

    }
    static int value=Integer.MIN_VALUE;
    int find(Node node,int k){
        if(node==null)
            return -1;
        value=(value>node.data)?value:node.data;
        if(node.data<k){
            return find(node.right,k);
        }else if(node.data>k) {
            return find(node.left, k);
        }
        else
            return value;
    }

    void preorder() {
        if(root==null)
            System.out.println("BST is empty");
        else
            preOrder(root);
    }
    void preOrder(Node node) {
        if(node==null)
            return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}



































class Node{
    public int data;
    public Node left;
    public Node right;
    Node(int d){
        left=null;
        right=null;
        data=d;
    }
}