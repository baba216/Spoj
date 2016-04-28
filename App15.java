import java.util.*;
import java.io.*;

public class App15{
	
	public static void main(String[] args){
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(10);
		binaryTree.insert(3);
		binaryTree.insert(8);
		binaryTree.insert(9);
		/*binaryTree.addNode(5);
		binaryTree.addNode(10);
		binaryTree.addNode(3);
		binaryTree.addNode(8);
		binaryTree.addNode(9);
		/* Binary Tree Pre-Order Traversal */
		binaryTree.preOrder();
		/* Binary Tree Post Order Traversal */
		binaryTree.postOrder();
		/* Binary Tree In-Order Traversal */
		binaryTree.inOrder();
	}
}

class Node {
	
	private int data;
	private Node left;
	private Node right;

	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void setData(int data){
		this.data = data;
	}

	public int getData(){
		return this.data;
	}

	public void setLeftNode(Node left){
		this.left = left;
	}

	public Node getLeftNode(){
		return this.left;
	}
	public void setRightNode(Node right){
		this.right = right;
	}

	public Node getRightNode(){
		return this.right;
	}
}

class BinaryTree {
	
	private Node root;

	public BinaryTree(){
		root = null;
	}
	/*public void addNode(int data){
		Node newNode = new Node(data);
		if(root == null){
			root = newNode;
			System.out.println("Adding Root:"+root.getData());
		}else{
		       Node temp = root;
		       Node previous = null;
		       while(temp != null){
		       		previous = temp;
				if(data >= temp.getData()){
					temp = temp.getRightNode();
				}else{
					temp = temp.getLeftNode();
				}
		       }
		if(data >= previous.getData()){
 			previous.setRightNode(newNode);
			System.out.println("Parent Node:"+previous.getData()+", Right Child:"+ previous.getRightNode().getData());
		}
		else{
			previous.setLeftNode(newNode);		
			System.out.println("Parent Node:"+previous.getData()+", Left Child:"+ previous.getLeftNode().getData());
		}
	}
   }*/

	public void preOrder(){
		System.out.println("---------PRE-ORDER TRAVERSAL------------");
		preOrderTraversal(root);
	}  
       private void preOrderTraversal(Node root){
       		if(root== null)
			return;
		else{
			System.out.println(root.getData());
			preOrderTraversal(root.getLeftNode());
			preOrderTraversal(root.getRightNode());	
		}
       }	
	public void postOrder(){
		System.out.println("-----POST-ORDER TRAVERSAL----------");
		postOrderTraversal(root);
	}

	private void postOrderTraversal(Node root){
		if(root != null){
			postOrderTraversal(root.getLeftNode());
			postOrderTraversal(root.getRightNode());
			System.out.println(root.getData());
		}
	}

	public void inOrder(){
		System.out.println("-----------IN-ORDER TRAVERSAL------------");
		inOrderTraversal(root);
	}

	private void inOrderTraversal(Node root){
		if(root != null){
			inOrderTraversal(root.getLeftNode());
			System.out.println(root.getData());
			inOrderTraversal(root.getRightNode());
		}
	}	
     	public void insert(int data){
		System.out.println("Hello");
		addNode(data,root);
	}
	private void addNode(int data, Node root){
		if(root == null){
			//Node parent = root;
			Node newNode = new Node(data);
			root = newNode;
			//System.out.println("ELEMENT ADDED:"+root.getData()+",PARENT:"+ parent.getData());
			return;
		}else{
			if(data < root.getData())
				addNode(data,root.getLeftNode());
			else
				addNode(data,root.getRightNode());
		} 
	}

}
