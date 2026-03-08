class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited=new HashSet<>();
        while(n!=1 && !visited.contains(n)){
            visited.add(n);
            int squaresum=0;
            while(n!=0){
                int digit=n%10;
                squaresum+=(digit*digit);
                n/=10;
            }
            n=squaresum;
        }
        return n==1;
    }
}