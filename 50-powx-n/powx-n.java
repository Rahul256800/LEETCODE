class Solution {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        long power=Math.abs((long)n);
        double result=1.0;
        while(power>0){
            if(power%2==1){
                result *= x;
                power=power-1;
            }
            else{
                    power=power/2;
                    x= x*x;
            }        
        }
        return n>0 ? result : 1.0/result;
    }
}