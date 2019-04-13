package xyz.cglzwz.structures.binarytree;

/**
 * 二叉树的三种遍历（递归）
 * @author chgl16
 * @date 2019-04-13
 */
public class Ergodic {

	public static void main(String[] args) {
		TreeNode a = new TreeNode("a");
		TreeNode b = new TreeNode("b");
		TreeNode c = new TreeNode("c");
		TreeNode d = new TreeNode("d");
		TreeNode e = new TreeNode("e");
		TreeNode f = new TreeNode("f");
		TreeNode g = new TreeNode("g");
		TreeNode h = new TreeNode("h");
		
		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;
		d.left = f;
		f.left = g;
		f.right = h;
		
		// 遍历都是传跟节点做做参数
		
		// 先序遍历
		System.out.println("先序遍历: ");
		preorderTraversal(a);
		
		System.out.println("\n********************");
		
		// 中序遍历
		System.out.println("中序遍历: ");
		midorderTraversal(a);
		
		System.out.println("\n********************");
		
		// 后序遍历
		System.out.println("后序序遍历: ");
		lastorderTraversal(a);

	}
	
	/**
	 * 先序遍历
	 * @param root
	 */
	public static void preorderTraversal(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	
	/**
	 * 中序遍历
	 * @param root
	 */
	public static void midorderTraversal(TreeNode root) {
		if (root != null) {
			preorderTraversal(root.left);
			System.out.print(root.val + " ");
			preorderTraversal(root.right);
		}
	}
	
	/**
	 * 后序遍历
	 * @param root
	 */
	public static void lastorderTraversal(TreeNode root) {
		if (root != null) {
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			System.out.print(root.val + " ");
		}
	}
	
}



class TreeNode {
	String val;
	// 左子树
	TreeNode left;
	// 右子树
	TreeNode right;
	
	// 构造函数
	public TreeNode(String val) {
		this.val = val;
	}
}