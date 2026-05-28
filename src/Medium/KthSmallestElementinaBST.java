package Medium;

import java.util.Stack;

public class KthSmallestElementinaBST {
	public int kthSmallest(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode currentNode = root;

		while (currentNode != null || !stack.isEmpty()) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}

			currentNode = stack.pop();
			if (--k == 0) return currentNode.val;
			currentNode = currentNode.right;
		}

		return 0;
	}
}
