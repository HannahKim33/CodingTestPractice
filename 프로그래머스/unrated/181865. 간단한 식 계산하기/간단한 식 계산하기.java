class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String op="";
        int opIndex=0;
        for (int i=0; i<binomial.length(); i++){
            char currentChar=binomial.charAt(i);
            if(currentChar=='+'||currentChar=='-'||currentChar=='*'){
                op=String.valueOf(currentChar);
                opIndex=i;
                break;
            }
        }
        int a=Integer.parseInt(binomial.substring(0,opIndex-1));
        int b=Integer.parseInt(binomial.substring(opIndex+2,binomial.length()));
        
        switch(op){
            case "+": answer=a+b; break;
            case "-": answer=a-b; break;
            case "*": answer=a*b; break;
        }
        return answer;
    }
}