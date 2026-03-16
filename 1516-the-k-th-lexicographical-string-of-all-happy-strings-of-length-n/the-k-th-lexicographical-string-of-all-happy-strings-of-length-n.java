class Solution {//a,b,c, n = 3, 3 2 2
    public String getHappyString(int n, int k) {
        int total = 3;
        for (int i = 2; i <= n ; i++){
            total *= 2;
        }
        StringBuilder ans = new StringBuilder();
        if (total < k) return "";
        if (k <= (total/3)){
            ans.append("a");
        } else if (k <= (2*total/3)){
            ans.append("b");
            k = k - total/3;
        } else {
            ans.append("c");
            k = k - (2 * total) / 3;
        }
        total /= 3;
        for(int i = 2; i <= n; i++){
            switch (ans.charAt(i - 2)){
                case 'a':
                    if (k <= (total/2)){
                        ans.append('b');
                    } else {
                        ans.append('c');
                        k = k - total / 2;
                    }
                    break;
                    
                case 'b':
                    if (k <= (total/2)){
                        ans.append('a');
                    } else {
                        ans.append('c');
                        k = k - total / 2;
                    }                    
                    break;
                    
                case 'c':
                    if (k <= (total/2)){
                        ans.append('a');
                    } else {
                        ans.append('b');
                        k = k - total / 2;
                    }
                    break;
            }
            total /= 2;
        }
        return ans.toString();
    }
}

