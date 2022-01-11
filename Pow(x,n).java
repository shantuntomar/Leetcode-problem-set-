class Solution {
    public double myPow(double x, int n) {
        long m = n;
        if(m < 0) m *= -1;
        double ans = pow(x,m);
        return n >= 0 ? ans : 1/ans;
    }
    public static double pow(double x , long n) {
        if(n == 0) return 1;
        return n%2 == 0 ? pow(x*x,n/2) : x*pow(x*x,(n-1)/2);
    }
}
