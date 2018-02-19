/*
//This is geeksForGeeks question it works for given testcases but not for others :(
//same output from both the codes
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
public class GFGlongestPath {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        Graph mygraph;
        for(int z=0;z<testcases;z++){
            int n=input.nextInt();
            mygraph=new Graph(n+1);
            for(int i=1;i<n;i++){
                mygraph.addEdge(input.nextInt(),input.nextInt(),input.nextInt());
            }
            System.out.println(mygraph.distance());
        }

    }
}
class edge{
    int data;
    int weight;
    edge(int d, int w){
        data=d;
        weight=w;
    }
}
class Graph {
    int vertices;
    LinkedList<edge> graph[];
    int dist[];
    int inf = Integer.MAX_VALUE;

    Graph(int v) {
        vertices = v;
        graph = new LinkedList[v];
        dist = new int[vertices];
        Arrays.fill(dist, inf);
        for (int i = 0; i < vertices; i++) {
            graph[i] = new LinkedList<edge>();

        }
    }

    void addEdge(int src, int des, int wt) {
        graph[src].add(new edge(des, wt));
    }

    int distance() {
        boolean visited[] = new boolean[vertices];
        Arrays.fill(visited, false);
        int max = Integer.MIN_VALUE;
        int l = 0;
        for (int i = 1; i < vertices; i++) {
            if (!visited[i]) {
                l = mdfs(i, visited);
                dist[i] = l;

                if (l > max)
                    max = l;
            }

        }

        return max;
    }

    int mdfs(int u, boolean[] visited) {
        if (dist[u] != inf)
            return dist[u];
        visited[u] = true;
        int s = 0, k = 0;
        edge l;
        Iterator<edge> it = graph[u].listIterator();
        while (it.hasNext()) {

            l = it.next();
            if (!visited[l.data]) {
                k = mdfs(l.data, visited) + l.weight;
            } else
                k = dist[l.data] + l.weight;

            if (k > s)
                s = k;
            k = 0;
        }
        dist[u]=s;

        return s;
    }
}

























//another try
/*
import java.util.*;
public class GFGlongestPath {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        graph mygraph;
        for(int z=0;z<testcases;z++){
            int n=input.nextInt();
            mygraph=new graph(n);
            for(int i=0;i<n-1;i++){
                mygraph.addEdge(input.nextInt(),input.nextInt(),input.nextInt());
            }
            System.out.println(mygraph.longest());
        }
    }
}
class edge{
    int data;
    int weight;
    edge(int d,int w){
        data=d;
        weight=w;
    }
}

class graph{
    int vertices;
    LinkedList<edge>graph[];
    graph(int v){
        vertices=v;
        graph=new LinkedList[v+1];
        for(int i=1;i<=v;i++)
            graph[i]=new LinkedList<edge>();
    }
    void addEdge(int src,int des,int wt){
        graph[src].add(new edge(des,wt));
    }
    public void Torder(int u,boolean[] visited, LinkedList<Integer>mystack){
        visited[u]=true;
        edge k;
        Iterator<edge>it=graph[u].listIterator();
        while(it.hasNext()){
            k=it.next();
            if(!visited[k.data])
                Torder(k.data,visited,mystack);
        }
        mystack.addLast(u);
    }





   int longest(){
        boolean visited[]=new boolean[vertices+1];
        Arrays.fill(visited,false);
        LinkedList<Integer>mystack=new LinkedList<Integer>();
        for(int i=1;i<=vertices;i++) {
            if(!visited[i])
                Torder(i,visited, mystack);
        }
        //System.out.println(mystack);
        Integer dist[]=new Integer[vertices+1];
        int inf=Integer.MIN_VALUE;
        Arrays.fill(dist,inf);
        dist[mystack.getLast()]=0;
        for(int i=1;i<=vertices;i++)
            if(dist[i]!=inf)
                break;
        while(!mystack.isEmpty()){
            int v=mystack.removeLast();
            if(dist[v]!=inf){
                Iterator<edge>it=graph[v].listIterator();
                while(it.hasNext()){
                    edge l=it.next();
                    if(dist[l.data]<(dist[v]+l.weight))
                        dist[l.data]=dist[v]+l.weight;
                }
            }
        }
        return Collections.max(Arrays.asList(dist));
   }
}
*/