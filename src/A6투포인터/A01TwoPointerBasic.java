package A6투포인터;

import java.util.*;

public class A01TwoPointerBasic {
    public static void main(String[] args) {
        int[] nums = {7,8,9,2,4,5,1,3,6};
        int target = 10;
        List<int[]> myList = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
        int temp = nums[left] + nums[right];
        if(temp==target) {
            myList.add(new int[]{nums[left], nums[right]});
            left++;
            right--;
        }
        else{

        left++;
            }
        }
        for(int[] arr : myList){
            System.out.println(Arrays.toString(arr));
        }
        List<int[]> list = new ArrayList<>();
        list.sort((a,b)->{
            int len1 = a[1]-a[0];
            int len2 = b[1]-b[0];
            if(len1!=len2){
                return a[1]-a[0];
            }

                return len1;
        });
}}
