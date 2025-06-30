package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

//트리 탐색 재귀적 호출
public class A01HeapSort구현 {
    static int heapLength;
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
        //최초 힙 구성 : 복잡도 n* log(n)
        heapLength = arr.length-1;
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(arr, i);
        }
        //루트노드와 최하위노드를 자리 change해가면서 재 heapify
        for(int i=arr.length-1 ; i>=0; i--){
            //0번쨰 index와 마지막 index의 자리 change
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapLength--;
            heapify(arr,0);
        }
        System.out.println(Arrays.toString(arr));

        //pq를 통한 정렬 방법
        //최초힙구성 : n*log(n)
        Queue<Integer> pq = new PriorityQueue<>(Arrays.asList(7,6,5,8,3,5,9,1,6));
        System.out.println(pq.poll());

    }

    static void heapify(int[] arr, int parent){
        // 자식 노드와의 비교 : parent*2+1,parent*2+2
        int temp1 = parent*2+1;
        int temp2 = parent*2+2;
        int minValue = arr[parent];
        int minIdx = parent;

        if(temp1<=heapLength && arr[temp1]<minValue){
            minValue=arr[temp1];
            minIdx=temp1;
        }

        if(temp2<=heapLength && arr[temp2]<minValue){
            minValue=arr[temp2];
            minIdx=temp2;
        }

        // 자식이 더 작으면 자리 change
        // 만약 자리 change가 발생하면 재귀적 호출

        if(minValue!=arr[parent]){
            //부모가 최소값이 아닐 때
            int temp = arr[parent];
            arr[parent] = arr[minIdx];
            arr[minIdx] = temp;
            heapify(arr, minIdx);
        }



    }
}
