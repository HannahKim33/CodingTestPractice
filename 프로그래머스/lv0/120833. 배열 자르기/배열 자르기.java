class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int answer_length=num2-num1+1;
        int[] answer=new int[answer_length];
        System.arraycopy(numbers, num1, answer, 0, answer_length);
        return answer;
    }
}