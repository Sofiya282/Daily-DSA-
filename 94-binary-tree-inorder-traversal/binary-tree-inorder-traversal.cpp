
class Solution {
public:
    void inorder(TreeNode* temp,vector<int>& ans){
        if(temp!= nullptr){
            inorder(temp->left,ans);
            ans.push_back(temp->val);
            inorder(temp->right,ans);
        }
    }
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> ans={};
        inorder(root,ans);
        return ans;
    }
};