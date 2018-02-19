
//Not worked for test cases Check the best submissions
import java.io.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class HeMancunianAndFantabulasPairs {
    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        int n = in.nextInt();
        LinkedList<Integer> mylist= new LinkedList<>();
        for (int i = 0; i < n; i++)
            mylist.addLast(in.nextInt());
        out.println(mylist);

        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        while(!mylist.isEmpty()){
            int j=1;int p,q;int inM=0;int inM2=0;
            while(j!=mylist.size()){
                if(j==1){
                    p=mylist.get(0);
                    q=mylist.get(1);
                    if(p<q){
                        max1=q;
                        max2=p;
                        hash.add(12);
                        inM2=1;
                        inM=2;
                    }
                    else{
                        max1=p;
                        inM=1;
                    }
                }
                else if(max1<mylist.get(j)){
                    max2=max1;
                    inM2=inM;
                    max1=max2;
                    inM=j+1;
                    hash.add(Integer.parseInt(inM2+""+inM));
                }
                j++;
            }
            mylist.removeFirst();
        }
        System.out.println(hash.size());
        /*
        Iterator<Integer>it=hash.iterator();
        while(it.hasNext())
            System.out.println(it.next());
*/





    }
}

