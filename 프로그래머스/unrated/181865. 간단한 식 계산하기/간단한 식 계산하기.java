class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split=binomial.split(" ");

        int a=Integer.parseInt(split[0]);
        int b=Integer.parseInt(split[2]);
        String op=split[1];
        
        switch(op){
            case "+": answer=a+b; break;
            case "-": answer=a-b; break;
            case "*": answer=a*b; break;
        }
        return answer;
    }
}