class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<52; i++){
            char ch;
            if(i<26){
                ch=(char)('A'+i);
            }else{
                ch=(char)('a'+i-26);
            }
            int n=0;
            for(int j=0; j<my_string.length(); j++){
                if(my_string.charAt(j)==ch){
                    n++;
                }
            }
            answer[i]=n;
        }
        return answer;
    }
}