package A7이분탐색;

import java.util.Arrays;

public class A01BinarySearchBasic {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,9,11,13,15,17,19};
//        int target =17;
//        int answer=-1;
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(arr[mid]==target) {
//                answer = mid;
//                break;
//            }
//
//            //왜이렇게 피곤하지용ㅇ....
//            // 1+ 19 를 봤어 10 보다 오른쪽에 있지
//            if(arr[mid]>target){
//                end=mid-1;
//            }
//            else{
//                start=mid+1;
//            }
//        }
//        System.out.println(answer);
//        target이 arr에 있따면 index값을 리턴하고, arr에 없다면 자리 index를 return;
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target =2;
        int answer = -1;
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(target == arr[mid]){
                //조건에 맞는 값을 찾았어도 최솟값/ 최댓값을 위해 이분탐색을 계속 진행할 수 있음.
                answer=mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
                //조건에 맞는 값이 없을 수도 있는 경우
                answer=mid;
            }
        }
        System.out.println(answer);

    }
}
