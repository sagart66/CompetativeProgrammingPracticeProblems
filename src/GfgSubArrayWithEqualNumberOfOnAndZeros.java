import java.util.LinkedList;
import java.util.Scanner;
public class GfgSubArrayWithEqualNumberOfOnAndZeros {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int z=0;z<testcases;z++){
            int n=input.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            System.out.println(subsets(a));
        }
    }
    static LinkedList<Integer> subsets(int a[]){
        LinkedList<Integer> l=new LinkedList<Integer>();
        int sum;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
                if(a[j]!=1)
                    sum-=1;
                else sum+=1;
                if(sum==0) {
                    l.addLast(i);
                    l.addLast(j);
                }
            }
        }
        return l;
    }


















}
