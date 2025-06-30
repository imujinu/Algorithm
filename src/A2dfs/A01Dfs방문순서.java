package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A01Dfs방문순서 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        //방문할 수 있는 점이 여러개인 경우, 정점번호가 작은것을 먼저 방문
        // 출방느 0부터 dfs로 방문 시 방문순서 : 0->1->3->2->4
        int[][] nodes = {{0,2},{0,1},{1,3},{2,3},{2,4}};
        //인접리스트를 활용해서 인접해 있는 노드를 빠르게 접근
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for(int i=0; i<5; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0; i< nodes.length; i++){
              int[] arr = nodes[i];
              int start = arr[0];
              int end = arr[1];
              adjList.get(start).add(end);
              adjList.get(end).add(start);
        }

        //정점 번호가 작은 것부터 방문하기 위한 정렬
        for(int i=0; i<adjList.size(); i++){
            adjList.get(i).sort(Comparator.naturalOrder());
        }
        dfs(0);
    }
    static void dfs(int start){
        visited[start] =true;

        for(int a : adjList.get(start)){
            if(!visited[a]){
            dfs(a);
            System.out.println(a);

            }
        }
    }
}
