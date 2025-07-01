package A4greedy;

import java.util.Arrays;

public class A02그리디활용문제 {
    public static void main(String[] args) {
        int[] people = {70,50, 80, 50};
        Arrays.sort(people);
        int count=0;
        for(int i=0; i<people.length-1; i++){
        if(people[i]+people[i+1]<=100){
            count++;
            i++;
        }
        count++;
        }
        System.out.println(count);
        //체육복
        //구명보트
    }
}
