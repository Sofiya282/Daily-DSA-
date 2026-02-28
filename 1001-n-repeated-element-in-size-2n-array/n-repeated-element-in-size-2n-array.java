class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n = nums.length / 2;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value == n){
                return key;
            }
        }
        return 0;
    }
}