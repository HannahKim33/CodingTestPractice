class Solution {
    public String solution(String n_str) {
        StringBuilder sb=new StringBuilder(n_str);
        int firstNum=sb.charAt(0)-'0';
        while(firstNum==0){
            sb.deleteCharAt(0);
            firstNum=sb.charAt(0)-'0';
        }
        return sb.toString();
    }
}