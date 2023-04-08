class Solution {
    public String solution(String my_string, int num1, int num2) {
        char char1=my_string.charAt(num1);
        char char2=my_string.charAt(num2);
        StringBuilder my_stringBuilder=new StringBuilder(my_string);
        my_stringBuilder.setCharAt(num1,char2);
        my_stringBuilder.setCharAt(num2,char1);
        return my_stringBuilder.toString();
    }
}