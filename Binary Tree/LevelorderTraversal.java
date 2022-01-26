//Time and Space Complexity O(n)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int count=queue.size();
            for(int i=0;i<count;i++)
            {
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
                
            }
            res.add(level);
        }
        return res;
    }
}