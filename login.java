package sunbeam;

class binarysearchtree{
	static class node{
		//node field
		private int data;
		private node left,right;
	     //node method
		public node() {
			data=0;
			left  = null;
			right = null;
		    }
		public node(int val) {
			data=val;
			left  = null;
			right = null;
		    }
		}
	
    // tree fields
	private node root;

	//tree method
	public binarysearchtree() {
		root = null;
		
		}
	void add(int val) {
		node newnode = new node(val);
		
	}
	}
	

public class BSTtreemain {
	public static void main(String[] args) {
		binarysearchtree t= new binarysearchtree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		
		
	}
}