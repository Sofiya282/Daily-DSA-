class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> ans = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : t.toCharArray()){
            ans.put(ch, ans.getOrDefault(ch, 0) - 1);
        }
        
        for(int val : ans.values()){
            if(val != 0){
                return false;
            }
        }
        
        return true;
    }
}