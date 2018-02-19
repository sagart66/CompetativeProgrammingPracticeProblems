import java.lang.reflect.Array;
import java.util.*;

public class GfgWaterConnectionProblem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int z=0;z<testcases;z++){
            graph1 mygraph=new graph1(input.nextInt());
            int e=input.nextInt();
            for(int i=0;i<e;i++)
                mygraph.addEdge(input.nextInt(),input.nextInt(),input.nextInt());
            mygraph.connectedComponents();

        }
    }
}
class Edge{
    int data;
    int weight;
    Edge(int d,int w){
        data=d;
        weight=w;
    }
}
class graph1{
    int vertices;
    boolean in[];
    boolean out[];
    LinkedList<Integer>CC[];
    LinkedList<Edge>graph[];
    graph1(int v){
        in=new boolean[v+1];
        out=new boolean[v+1];
        Arrays.fill(in,false);
        Arrays.fill(out,false);
        vertices=v;
        graph=new LinkedList[vertices+1];
        CC=new LinkedList[v+1];
        for(int i=1;i<=vertices;i++) {
            graph[i] = new LinkedList<Edge>();
        }
    }
    void addEdge(int src,int des,int wt){
        graph[src].add(new Edge(des,wt));
        in[des]=true;
        out[src]=true;
    }
    //union find
    int parent1;

    void connectedComponents(){
        boolean visited[]=new boolean[vertices+1];
        Arrays.fill(visited,false);
        int parent[]=new int[vertices+1];
        for(int i=1;i<=vertices;i++)
            parent[i]=i;
        for(int i=1;i<=vertices;i++){
            if(!visited[i]) {
                parent1=i;
                dfs(i, visited, parent);
            }
        }
        LinkedHashSet<Integer>hash=new LinkedHashSet<>();
        for(int i=1;i<=vertices;i++)
            hash.add(parent[i]);
        LinkedList<Integer>mylistin=new LinkedList<>();
        LinkedList<Integer>mylistout=new LinkedList<>();
        Iterator<Integer>it=hash.iterator();
        while(it.hasNext()){
            int s=it.next();
            for(int i=1;i<=vertices;i++){
                if(parent[i]==s){
                    if(!in[i])
                        mylistin.add(i);
                    if(!out[i])
                        mylistout.add(i);
                }
            }
        }
        System.out.println(mylistin);
        System.out.println(mylistout);

        LinkedList<Integer>len=new LinkedList<>();
        Arrays.fill(visited,false);
        for(int i=0;i<mylistin.size();i++){
            len.add(dfs1(mylistin.get(i),Integer.MAX_VALUE));
        }
        System.out.println(len);
        System.out.println(len.size());
       int  t=len.size();
       /* for(int i=0;i<t;i++){
           int l=mylistin.indexOf(Collections.min(mylistin));
           System.out.println(mylistin.remove(l)+" "+mylistout.remove(l)+" "+len.remove(l));


        }*/






    }
int dfs1(int u,int k){
        Iterator<Edge>it=graph[u].listIterator();
        while(it.hasNext()){
            Edge l=it.next();
            k=(k>l.weight)?l.weight:k;

            int s=dfs1(l.data,k);
            k=(k>s)?s:k;
        }
return k;

}













    void dfs(int u,boolean[] visited,int []parent){
        visited[u]=true;
        parent[u]=parent1;
        Iterator<Edge>it=graph[u].listIterator();
        while(it.hasNext()){
            Edge z=it.next();
            if(!visited[z.data]){
                dfs(z.data,visited,parent);

            }else {
                if(parent[z.data]!=parent1)
                parent1 = parent[z.data];
            }
            }
        parent[u]=parent1;
    }







    }
