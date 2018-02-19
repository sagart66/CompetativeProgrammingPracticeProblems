import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HeSignalRange {
    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);


        LinkedList<Integer> mystack=new LinkedList<>();
        LinkedList<Integer>points=new LinkedList<>();
        int testcases=in.nextInt();
        for(int j=0;j<testcases;j++){

            int n = in.nextInt();
            int a[]=in.nextIntArray(n);
            int l = 0, p;
            for (int i = 0; i < n; i++) {
                l = a[i];
                p = 0;
                while (!mystack.isEmpty() && l > mystack.peek()) {
                    p += points.pop();
                    mystack.pop();

                }
                mystack.push(l);
                points.push(1 + p);
                System.out.print(points.peek() + " ");

            }
            mystack.clear();
            points.clear();
            System.out.println();
        }
    }
}






