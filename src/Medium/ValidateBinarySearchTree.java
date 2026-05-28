package Medium;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		ArrayList<Integer> dfs = DFSInOrder(root);

		for (int i = 1; i < dfs.size(); i++) {
			if (dfs.get(i) <= dfs.get(i - 1)) return false;
		}

		return true;
	}

	public ArrayList<Integer> DFSInOrder(TreeNode root) {
		ArrayList<Integer> results = new ArrayList<>();

		class Traverse {
			Traverse(TreeNode currentNode) {
				if (currentNode.left != null) new Traverse(currentNode.left);
				results.add(currentNode.val);
				if (currentNode.right != null) new Traverse(currentNode.right);
			}
		}

		new Traverse(root);
		return results;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
