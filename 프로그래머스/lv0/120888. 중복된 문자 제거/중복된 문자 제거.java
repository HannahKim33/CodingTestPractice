class Solution {
    public String solution(String my_string) {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<my_string.length(); i++){
            char currentChar=my_string.charAt(i);
            if(sb.indexOf(String.valueOf(currentChar))==-1){
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }
}