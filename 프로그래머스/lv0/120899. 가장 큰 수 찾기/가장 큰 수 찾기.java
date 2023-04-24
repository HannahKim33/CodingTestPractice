class Solution {
    public int[] solution(int[] array) {
        int maxN=array[0];
        int maxIndex=0;
        for(int i=0; i<array.length-1; i++){
            if(array[i]<array[i+1]){
                maxN=array[i+1];
                maxIndex=i+1;
            }
        }
        int[] answer = {maxN, maxIndex};
        return answer;
    }
}