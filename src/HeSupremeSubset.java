//THIS IS NOT AN EFFECTIVE  SOLUTION

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
public class HeSupremeSubset {
    public static void main(String[] args) throws IOException{
        final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        final String[] array1=br.readLine().split(" ");
        int n=Integer.parseInt(array1[0]);
        int m=Integer.parseInt(array1[1]);
        final String[] array=br.readLine().split(" ");
        final int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(array[i]);
        }
        LinkedList<Integer>Supremesubset=getSupreme(a,m);
        System.out.println(Supremesubset.size());
        Iterator<Integer>it=Supremesubset.listIterator();
        int k;
        while(it.hasNext()){
            k=it.next();
            System.out.print(k+" ");
        }




    }
    public static LinkedList<Integer> getSupreme(int a[],int m){
        LinkedList<Integer> sets[]=new LinkedList[a.length];
        LinkedList<Integer> sameIndex=new LinkedList<>();
        int same=0;
        int Smax=0;
        int Imax=0;int sm;
        for(int i=0;i<sets.length;i++)
        sets[i]=new LinkedList<Integer>();


        for(int i=0;i<a.length-1;i++){
            sm=0;
           for(int j=i+1;j<a.length;j++){
               if(Math.abs(a[j]-a[i])%m==0 && checkAll(sets[i],a[j],m)){
                   if(sets[i].isEmpty()) {
                        sets[i].add(a[i]);
                   }
                       sets[i].add(a[j]);
                       sm++;

               }

           }
            if(sm>Smax) {
                Smax = sm;
                Imax=i;
                same=0;
            }
            else if(sm==Smax) {
                same++;
                if(same==1){
                    sameIndex.add(Imax);
                    sameIndex.add(i);
                 }else
                     sameIndex.add(i);

           }
        }
        if(same==0)
            return sets[Imax];
        else{
            for(int i=0;i<sameIndex.size();i++){
                Collections.sort(sets[i]);
            }
        return sets[SS(sets,sameIndex)];
            }
        }

    static boolean checkAll(LinkedList<Integer> set,int p,int m){

        if(set==null)return true;
        Iterator<Integer> it=set.listIterator();
        int l;

        while(it.hasNext()){
            l=it.next();
            if(Math.abs(l-p)%m!=0)
                return false;
        }
        return true;
    }
 static int SS(LinkedList<Integer>set[],LinkedList<Integer> same){
        Iterator<Integer>it=same.listIterator();
    int a[]=new int[same.size()];
    int i=0;
    while(it.hasNext()) {
        i=it.next();
      //  System.out.println(set[i]);
        if(!set[i].isEmpty())
        a[i] = Integer.parseInt(set[i].toString().replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").replaceAll(" ", ""));
    }
//    for(int j:a)
  //      System.out.println(j);
    return min(a);
}
    public static int min(int a[]){
        int min = Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0 && min > a[i]) {
                min = a[i];
                index = i;
            }
        }
    return index;
    }
}
