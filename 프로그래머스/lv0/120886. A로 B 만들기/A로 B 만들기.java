import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(String before, String after) {
        ArrayList<Character> before_list=new ArrayList<Character>();
        ArrayList<Character> after_list=new ArrayList<Character>();
        
        for(int i=0; i<before.length(); i++){
            before_list.add(before.charAt(i));
        }
        for(int i=0; i<after.length(); i++){
            after_list.add(after.charAt(i));
        }
        
        Collections.sort(before_list);
        Collections.sort(after_list);
        
        int answer = 1;
        for(int i=0; i<before_list.size(); i++){
            if(before_list.get(i)!=after_list.get(i)){
                answer=0;
            }
        }
        return answer;
    }
}