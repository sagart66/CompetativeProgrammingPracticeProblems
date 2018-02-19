import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.io.IOException;

public class HeSupremeSubsetEfficient {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[]=br.readLine().split(" ");
        int n=Integer.parseInt(a[0]);
        int m=Integer.parseInt(a[1]);
        a=br.readLine().split(" ");
        int array[]=new int[n];

        HashMap<Integer,Integer>hash=new HashMap<Integer, Integer>();
        int maxsize=-1;int l;int k;
        for(int i=0;i<n;i++) {
            array[i] = Integer.parseInt(a[i]);
            l=array[i]%m;
            if(!hash.containsKey(l)){
                hash.put(l,1);
                if(maxsize<1){
                    maxsize=1;

                }
            }else{
                k=hash.get(l)+1;
                hash.put(l,k);
                if(maxsize<k){
                    maxsize=k;

                }
            }
        }
        int mod=0;
        LinkedList<Integer>output=new LinkedList<Integer>();
        Arrays.sort(array);
        boolean flag=false;
        for(int i:array){
            if(hash.get(i%m)==maxsize && !flag){
                mod=i%m;
                output.add(i);
                flag=true;
            }
            else if(flag && i%m==mod)
                output.add(i);
        }
        System.out.println(maxsize);
        for(int i=0;i<maxsize;i++)
            System.out.println(output.get(i));
    }
}
