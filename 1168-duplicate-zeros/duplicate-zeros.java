class Solution {
    public void duplicateZeros(int[] arr) {
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int j = 0;
        for(int i = 0; i < arr1.length; i++){
            arr[j] = arr1[i];
            j++;
            if(arr1[i] == 0 && j < arr1.length){
                arr[j] = 0;
                j++;
            }
            if(j >= arr1.length){
                break;
            }
        }
    }
}