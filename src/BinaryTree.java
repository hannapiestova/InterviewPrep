class Node{
    int key;
    Node left;
    Node right;

    public Node(int value){
        this.key=value;
        left=right=null;
    }
}

public class BinaryTree {


        Node root;
        public BinaryTree(int value ){
            root= new Node(value);


        }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);

        tree.root.left= new Node(2);
        tree.root.right= new Node(3);

        System.out.println(tree.root.right.key);
    }



}
