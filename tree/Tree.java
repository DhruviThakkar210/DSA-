import java.util.Scanner;
class Node 
{
	int data;
	
	Node left;
	Node right;

	Node(int data)
	{
		this.data=data;
		
	}

}


class BinaryTree
{
void  createTree() 
{

	Node  root = null,left,right,q = null;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the data ");
	int data = sc.nextInt();
	Node p = new Node(data);
	

	if(root == null)
	 {
            root = p;
	 }
	 else 
	 	 q = root ;
	      Node parent;

	 while(true)
	 {
	 	parent = q;
	 	if(data<q.data)
	 	{
	 		q = q.left;
		 	
		 	if(q == null)
		 	{
	           parent.right = p;
		 	}

        }
        else 
        {
        	q = q.right;
        	if(q == null)
        	{
        		parent.right = p;
        	}
        }



	 }
	}

	 void display( Node q)

	 {
	 	
	 	if(q!=null)
	 	{
	 		System.out.println(q.data);
	 		display(q.left);
	 			display(q.right);
	 	}
	 }

	}









 





class Tree 
{
	public static void main(String[] args) 
	{
		Node root = null;
	BinaryTree tree = new BinaryTree();
 
    tree.createTree();
   


    tree.display(root);
	
	}
}