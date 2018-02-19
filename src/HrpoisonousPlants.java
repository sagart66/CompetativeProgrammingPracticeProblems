import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
public class HrpoisonousPlants {
    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);


        int n=in.nextInt();
        int h[]=in.nextIntArray(n);

        LinkedList<Integer> mystack=new LinkedList<Integer>();
        boolean removed=false;
        int t=0;
        int i=0;int day=0;int max=0;
        while(i<n){
            if(mystack.isEmpty() && !removed)
                mystack.addLast(h[i++]);
            else if(mystack.isEmpty() && removed && t>h[i])
                    mystack.addLast(h[i++]);
            else if(removed && h[i]>t){
                removed=true;
                t=h[i++];
                day=1;
            }
            else if(removed && h[i]<t){
                if(h[i]>mystack.getLast()){
                    day++;
                    max=(max<day)?day:max;
                    removed=true;
                    t=h[i++];
                }
                else if(h[i]<mystack.getLast()){
                    mystack.addLast(h[i++]);
                    removed=false;
                }
            }
            else if(!removed && h[i]>mystack.getLast()){
                removed=true;
                day=1;
                t=h[i++];
            }
            else if(!removed && h[i]<mystack.getLast()){
                mystack.addLast(h[i++]);
            }
            /*
            System.out.println(i);
            System.out.println(mystack);
            System.out.println(max);
            */
            max=(max<day)?day:max;
        }
        System.out.println(max);
    }
}
