package A5dp;

public class A01Coin {
    public static void main(String[] args) {
        Integer[] arr = {1,4,5};
        int target = 13;
        int[] dp = new int[target+1];
        dp[0]=0;
        dp[1] =1;
        dp[2] =2;
        dp[3] =3;
        dp[4] = 1;
        dp[5] = 1;
        for(int i=6; i<=target ; i++){
            if(i%4==0){
                dp[i] = i/4;
            }
            if(i%5==0){
                dp[i] = i/5;
            }
            else{


            dp[i] = Math.min(dp[i-4],Math.min(dp[i-1],dp[i-5]))+1;

            }
        }
        System.out.println(dp[7]);
    }
}
