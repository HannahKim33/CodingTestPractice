class Solution {
    public int[] solution(String myString) {
        int[] answer;
        String []arr = myString.split("x");
        if(myString.charAt(myString.length()-1)=='x'){
            answer = new int[arr.length+1];
        }else{
            answer = new int[arr.length];
        }
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i].length();
        }
        if(myString.charAt(myString.length()-1)=='x'){
            answer[answer.length-1]=0;
        }
        return answer;
    }
}