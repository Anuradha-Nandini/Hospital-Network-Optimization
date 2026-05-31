public class Prim {

    public void primMST(int[][] graph) {

        int V = graph.length;

        boolean[] selected =
                new boolean[V];

        selected[0] = true;

        int edges = 0;

        while(edges < V - 1) {

            int min = Integer.MAX_VALUE;
            int x = 0;
            int y = 0;

            for(int i=0;i<V;i++) {

                if(selected[i]) {

                    for(int j=0;j<V;j++) {

                        if(!selected[j]
                                && graph[i][j] != 0
                                && graph[i][j] < min) {

                            min = graph[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }

            System.out.println(
                    x + " - " + y +
                    " : " + min);

            selected[y] = true;
            edges++;
        }
    }
}