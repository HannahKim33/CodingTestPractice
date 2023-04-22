class Solution {
    public String solution(int age) {
        StringBuilder sb_age=new StringBuilder(age+"");
        StringBuilder sb_answer=new StringBuilder();
        for(int i=0; i<sb_age.length(); i++){
            sb_answer.append(String.valueOf((char)(sb_age.charAt(i)+49)));
        }
        return sb_answer.toString();
    }
}