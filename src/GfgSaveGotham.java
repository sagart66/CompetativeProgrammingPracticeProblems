import java.util.LinkedList;
import java.util.Scanner;
public class GfgSaveGotham {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        int sum=0;
        LinkedList<Integer>queue=new LinkedList<Integer>();
        LinkedList<Integer>mylist=new LinkedList<>();
        for(int i=0;i<n;i++) {
                    int k=input.nextInt();
                    while(!queue.isEmpty() && queue.getLast()<k){
                        sum+=k;
                        mylist.addLast(k);
                        queue.removeLast();
                    }
                    if(i!=n-1)
                    queue.addLast(k);
        }
        //System.out.println(mylist);
        System.out.println(sum);
    }

}
