import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Solution {
    public String[] solution(String myString) {
        String[] answer=myString.split("x");
        ArrayList<String> list=new ArrayList<String>(Arrays.asList(answer));
        for(Iterator<String> iterator=list.iterator(); iterator.hasNext();){
            if (iterator.next().equals("")) {
                iterator.remove();
            }
        }
        Collections.sort(list);
        answer = list.toArray(new String[list.size()]);
        return answer;
    }
}