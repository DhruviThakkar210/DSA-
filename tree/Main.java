import java.util.Scanner;
class Node {
int data;
Node left;
Node right;

public Node(int data) {
	this.data = data;
}
}

class BinaryTree {
Node root;

public void addNode() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the data ");
	int data = sc.nextInt();
	Node p = new Node(data);
	if (root == null) {
	root = p;
	} else {
	Node q = root;
	Node parent;

	while (true) {
		parent = q;

		if (data < q.data) {
		q = q.left;
		if (q == null) {
			parent.left = p;
			return;
		}
		} else {
		q = q.right;
		if (q == null) {
			parent.right = p;
			return;
		}
		}
	}
	}
}

public void preOrderTraversal(Node q) {
	if (q != null) {
	System.out.print(q.data + " ");
	preOrderTraversal(q.left);
	preOrderTraversal(q.right);
	}
}

public void postOrderTraversal(Node q) {
	if (q != null) {
	
	preOrderTraversal(q.left);
	preOrderTraversal(q.right);
	System.out.print(q.data + " ");
	}
}
}

public class Main {
public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();

	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();
	tree.addNode();

	tree.preOrderTraversal(tree.root);
	tree.postOrderTraversal(tree.root);
}
}
