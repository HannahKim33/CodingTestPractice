class Solution {
    public int solution(int n) {
        int answer=0;
        StringBuilder sb=new StringBuilder(n+"");
        for (int i=0; i<sb.length(); i++){
            answer+=Integer.parseInt(sb.charAt(i)+"");
        }
        return answer;
    }
}