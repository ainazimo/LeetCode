package December;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;

        return n1.val == n2.val
                && isMirror(n1.left, n2.right)
                && isMirror(n1.right, n2.left);
    }
}
