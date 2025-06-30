package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A02Dfs모든경우의수 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static List<Integer> list;
    public static void main(String[] args) {
        // 1~10까지의 노드가 존재
        int[][] nodes = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3,7}, {4,8}, {4,9}, {5,10}};

        adjList = new ArrayList<>();
        list = new ArrayList<>();
        visited = new boolean[11];
        for(int i=0; i<11; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i< nodes.length; i++){
            int[] arr = nodes[i];
            int start = arr[0];
            int end = arr[1];
            adjList.get(start).add(end);
        }

        for(int i=0; i<adjList.size(); i++){
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(1);

    }
    static void dfs(int start){
        list.add(start);
        boolean check = true;
       for(int i : adjList.get(start)){
           dfs(i);
           check=false;
           list.remove(list.size()-1);
       }
       if(check){
           System.out.println(list);

       }
    }
}
