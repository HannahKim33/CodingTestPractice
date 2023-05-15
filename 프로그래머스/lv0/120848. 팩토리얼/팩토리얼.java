class Solution {
    public int solution(int n) {
        int j=1;
        int i=1;
        while(j<=n){
            j*=++i;
        }
        return --i;
    }
}