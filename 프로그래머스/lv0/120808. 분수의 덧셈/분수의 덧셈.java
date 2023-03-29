class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer=new int[2];
        int lcm_denom=lcm(denom1, denom2);
        numer1 *= (lcm_denom/denom1);
        numer2 *= (lcm_denom/denom2);
        int combined_numer = numer1+numer2;
        int gcd_numer_denom=gcd(combined_numer, lcm_denom);
        while(gcd_numer_denom!=1){
            combined_numer/=gcd_numer_denom;
            lcm_denom/=gcd_numer_denom;
            gcd_numer_denom=gcd(combined_numer, lcm_denom);
        }
        answer[0]=combined_numer;
        answer[1]=lcm_denom;
        return answer;
    }
}