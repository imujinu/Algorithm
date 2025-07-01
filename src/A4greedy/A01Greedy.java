package A4greedy;

public class A01Greedy {
    public static void main(String[] args) {
        int coin = 99;
        int[] arr = {1,5,10,20};
        int temp=0;
        for(int i=arr.length-1; i>=0; i--){
            temp+=coin/arr[i];
            coin%=arr[i];
        }
        System.out.println(temp);

    }
}
