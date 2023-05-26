class Solution {
    public int solution(int[] sides) {
        int max=sides[0];
        int max_index=0;
        for(int i=1; i<sides.length; i++){
            if(max<sides[i]){
                max=sides[i];
                max_index=i;
            }
        }
        int sumOfTwo=0;
        for(int i=0; i<sides.length; i++){
            if(i!=max_index){
                sumOfTwo+=sides[i];
            }
        }
        if(max<sumOfTwo){
            return 1;
        }else{
            return 2;
        }
    }
}