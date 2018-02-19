import java.util.*;

public class GfgPassTheSemester {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int z=0;z<testcases;z++)
        {
            int n=input.nextInt();
            int m=input.nextInt();
            int p=input.nextInt();
            int time[]=new int[n];
            int wt[]=new int[n];
            HashMap<Integer,Double> hash=new HashMap<>();
            for(int i=0;i<n;i++){
                time[i]=input.nextInt();
                wt[i]=input.nextInt();
                hash.put(i,(double)(wt[i]/time[i]));
            }





        }

    }
}
