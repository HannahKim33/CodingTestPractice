class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)Math.ceil(n/2.0)];
        int i=0;
        for(int j=1; j<=n; j+=2){
            answer[i]=j;
            i++;
        }
        return answer;
    }
}