class Solution {
    public String solution(String my_string) {

        char[] array = my_string.toCharArray();
        for (int i=0; i<array.length; i++){
            if(Character.isUpperCase(array[i])){
                array[i]=Character.toLowerCase(array[i]);
            }else{
                array[i]=Character.toUpperCase(array[i]);
            }
        }
        return String.valueOf(array);
    }
}