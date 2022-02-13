//Bottom up level order tarversal

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0;i<level;i++)
            {
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                  if(queue.peek().right != null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().val);
            }
            ans.add(sublist);
        }
        Collections.reverse(ans);
        return ans;
    }
}