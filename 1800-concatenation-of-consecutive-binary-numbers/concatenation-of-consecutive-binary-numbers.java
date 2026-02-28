class Solution {
    // public String convertBinary(int i){
    //     StringBuilder sb = new StringBuilder();
    //     while(i > 0){
    //         sb.append(i & 1);
    //         i >>= 1;
    //     }
    //     return sb.reverse().toString();
    // }
    // public int convertDecimal(String binaryString){
    //     int decimal = 0, i = 0;
    //     for(char ch : binaryString.toCharArray()){
    //         decimal = (decimal * 2) + (ch - '0'); 
    //         i++;
    //         decimal %= (int)(Math.pow(10, 9)) + 7;
    //     }
    //     return decimal;
    // }
    public int concatenatedBinary(int n) {
        // StringBuilder sb = new StringBuilder();
        // for(int i = 1; i <= n; i++){
        //     sb.append(convertBinary(i));
        // }
        // System.out.println(sb);
        // int decimal = convertDecimal(sb.reverse().toString());
        // System.out.println(decimal);
        // return decimal;
        long result = 0;
        int mod = 1000000007;
        int binaryLen = 0;
        for(int i = 1; i <= n; i++){
            if((i & (i - 1)) == 0){
                binaryLen++;
            }
            
            result = ((result << binaryLen) | i) % mod;
        }
        return (int)result;
    }
}