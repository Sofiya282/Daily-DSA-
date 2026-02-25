class Solution {
    public int countSetBits(int num){
        int count = 0;
        while(num > 0){
            count += (num & 1);
            num >>= 1;
        }//
        return count;
    }
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((countSetBits(arr[i]) > countSetBits(arr[j])) ||
                 (countSetBits(arr[i]) == countSetBits(arr[j])) && arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}