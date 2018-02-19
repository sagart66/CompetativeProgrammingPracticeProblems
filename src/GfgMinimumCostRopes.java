///*
//There are given n ropes of different lengths, we need to connect these
// ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. We need to connect the ropes with minimum cost.
//
//NOTE: this is optimised code first I did it by regular method
//
// /

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.LinkedList;
public class GfgMinimumCostRopes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        PriorityQueue<Integer> list=new PriorityQueue<Integer>();
        for(int z=0;z<testcases;z++){
            int n=input.nextInt();
            for(int i=0;i<n;i++)
                list.add(input.nextInt());
            int cost=0;
            while(!list.isEmpty()){
                if(list.size()==2){
                    cost+=list.remove()+list.remove();
                }
                else{
                    int p=list.remove()+list.remove();
                    list.add(p);
                    cost+=p;
                }
            }
            System.out.println(cost);
        }
    }
}
