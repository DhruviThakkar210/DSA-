import java.util.Scanner;

class GraphSearching 
{
     Scanner sc = new Scanner(System.in);
 
        // n is the number of vertices
        // m is the number of edges
        int n = sc.nextInt();
        int m = sc.nextInt();
          
	int[][] adjMat = new int[n][n];
void create()
{
	
        for (int i = 0; i < m; i++) 
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMat[u][v] = 1;
       
            // for a directed graph with an edge pointing
            // from u to v,we just assign adjMat[u][v] as 1
        }

}

void display()
{
	for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++ ) {
                System.out.print( adjMat +"\t");
            }
            System.out.println();
        }
}

}


class GraphSearch 
{
	public static void main(String[] args) 
	{
		GraphSearching a = new GraphSearching();
		a.create();
		a.display();
	}
}