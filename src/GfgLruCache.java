/**
 *https://practice.geeksforgeeks.org/problems/lru-cache/1
 */
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.LinkedList;
public class GfgLruCache {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();

        LinkedList<Integer>queue;
        for(int z=0;z<testcases;z++){
            int capacity=input.nextInt();
            queue=new LinkedList<>();
            int list[]=new int[999999];
            Arrays.fill(list,-1);
            int q=input.nextInt();
            while(q>0){
                switch (input.next()){
                    case "SET":
                        int x=input.nextInt();
                        int y=input.nextInt();
                     //   System.out.println("sagar");
                        if(queue.size()<capacity){
                            if(list[x]==-1){
                                list[x]=y;
             //                   System.out.println(list[x]);
                                queue.addLast(x);
                            }
                        }
                        else{
                            int f=queue.removeFirst();
                            list[f]=-1;
                            queue.addLast(x);
                            list[x]=y;
                        }
                        break;
                    case "GET":
                        int b=input.nextInt();
                        System.out.print(list[b]+" ");
                        break;
                }
                q--;
            }
System.out.println();
        }



    }
}
