import java.util.*;
 
class Graph{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        // n is the number of vertices
        // m is the number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjMat = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMat[u][v] = 1;
       
            // for a directed graph with an edge pointing
            // from u to v,we just assign adjMat[u][v] as 1
        }

        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++ ) {
                System.out.print(adjMat[i][j]+"\t");
            }
            System.out.println();
        }
    }
}