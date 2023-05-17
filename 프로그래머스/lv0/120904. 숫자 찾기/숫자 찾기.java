class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        boolean found=false;
        String str_num=String.valueOf(num);
        for(int i=0; i<str_num.length(); i++){
            if(str_num.charAt(i)==k+'0'){
                answer=i+1;
                found=true;
                break;
            }
        }
        if(!found){
            answer=-1;
        }
        return answer;
    }
}