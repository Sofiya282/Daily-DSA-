class Solution {
public:
    bool check(TreeNode* subtree,long long mini,long long maxi){
        if(subtree == nullptr) return true;

        if(subtree->val <=mini || subtree->val>=maxi) return false;

        return check(subtree->left,mini,subtree->val) && check(subtree->right,subtree->val,maxi);
    }
    bool isValidBST(TreeNode* root) {
        return check(root,LLONG_MIN, LLONG_MAX);
    }
};