class Main {
    static class Node {
        int item;
        Node left, right;

        public Node(int key) {
            item = key;
            left = right = null;
        }
    }

    Node root;

    Main() {
        root = null;
    }

    public static int countLeaf(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeaf(node.left) + countLeaf(node.right);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();

        // Creating the new tree
        tree.root = new Node('p');
        tree.root.left = new Node('g');
        tree.root.right = new Node('w');
        tree.root.left.left = new Node('c');
        tree.root.left.right = new Node('k');
        tree.root.right.left = new Node('s');
        tree.root.right.right = new Node('y');
        tree.root.left.left.left = new Node('a');
        tree.root.left.left.right = new Node('e');
        tree.root.left.right.left = new Node('i');
        tree.root.left.right.right = new Node('m');
        tree.root.right.left.left = new Node('q');
        tree.root.right.left.right = new Node('u');
        tree.root.right.right.left = new Node('x');
        tree.root.right.right.right = new Node('z');

        int leafNodes = countLeaf(tree.root);

        System.out.println("Number of leaves: " + leafNodes);
    }
}
