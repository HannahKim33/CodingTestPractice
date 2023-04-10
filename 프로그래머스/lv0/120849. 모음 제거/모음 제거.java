import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        StringBuilder my_sb=new StringBuilder(my_string);
        ArrayList<Character> vowelList=new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));

        for(int i=0; i<my_sb.length(); i++){
            if(vowelList.contains(my_sb.charAt(i))){
                my_sb.deleteCharAt(i--);
            }
        }
        return my_sb.toString();
    }
}