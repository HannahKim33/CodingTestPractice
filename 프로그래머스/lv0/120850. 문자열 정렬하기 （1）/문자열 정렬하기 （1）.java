import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57){
                list.add(Integer.parseInt(Character.toString(my_string.charAt(i))));
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int index=0;
        for(int num:list){
            answer[index++]=num;
        }
        return answer;
    }
}