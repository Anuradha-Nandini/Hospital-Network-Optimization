

public class Main {

    public static void main(String[] args) {

        int[] admissions =
                {20,30,40,50,60};

        SegmentTree st =
                new SegmentTree(admissions);

        System.out.println(
                "Admissions (1-3): "
                + st.query(0,0,4,1,3));

        FenwickTree ft =
                new FenwickTree(5);

        ft.update(1,20);
        ft.update(2,30);

        System.out.println(
                "Occupied Beds: "
                + ft.query(2));

        int[][] graph = {
                {0,2,0,6},
                {2,0,3,8},
                {0,3,0,4},
                {6,8,4,0}
        };

        System.out.println(
                "\nPrim MST:");

        new Prim().primMST(graph);

        System.out.println(
                "\nKruskal MST:");

        new Kruskal().displayMST();

        System.out.println(
                "\nHospital Network Optimized");
    }
}