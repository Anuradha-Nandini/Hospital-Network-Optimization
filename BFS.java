import java.util.*;

class BFS {

    void bfs(List<List<Integer>> graph,
             int start) {

        boolean[] visited =
                new boolean[graph.size()];

        Queue<Integer> queue =
                new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print(node + " ");

            for(int next :
                    graph.get(node)) {

                if(!visited[next]) {

                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}