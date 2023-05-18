import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        for(int i=0; i<delete_list.length; i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(j)==delete_list[i]){
                    list.remove(j);
                }
            }
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}