import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        ArrayList<Character> checkList=new ArrayList<Character>();
        StringBuilder sb=new StringBuilder(my_string);
        for (int i=0; i<sb.length(); i++){
            char currentChar=sb.charAt(i);
            if(checkList.contains(currentChar)){
                sb.deleteCharAt(i--);
            }else{
                checkList.add(currentChar);
            }
        }
        return sb.toString();
    }
}