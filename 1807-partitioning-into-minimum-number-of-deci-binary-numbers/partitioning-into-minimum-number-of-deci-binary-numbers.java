class Solution {
    public int minPartitions(String n) {
        int max = Integer.MAX_VALUE;
        for(int i = 9; i >= 0; i--){
            if(n.contains(i + "")){
                return i;
            }
        }
        return 0;
    }
}