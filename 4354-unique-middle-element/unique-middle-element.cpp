class Solution {
public:
    bool isMiddleElementUnique(vector<int>& nums) {
        int count=0;
        for (int i=0;i<nums.size();i++) {
            if (nums[nums.size()/2]==nums[i]) {
                count++;
            }
        }
        if (count>1) {
            return false;
        }
        return true;
    }
};