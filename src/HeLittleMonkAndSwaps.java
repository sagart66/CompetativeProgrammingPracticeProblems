//Not competely accurate solution not saved!!!! :(
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HeLittleMonkAndSwaps {
    public static void main (String[]args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        int a[]=in.nextIntArray(5);
        for(int i:a)
            out.print(i);
        in.close();
        out.close();
            }
    }
 class FastScanner{
    BufferedReader reader;
    StringTokenizer st;
    FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}
    String next()
    {while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}
        st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
    String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}
    int    nextInt()   {return Integer.parseInt(next());}
    long   nextLong()  {return Long.parseLong(next());}
    double nextDouble(){return Double.parseDouble(next());}
    char   nextChar()  {return next().charAt(0);}
    int[]  nextIntArray(int n)         {int[] a= new int[n];   int i=0;while(i<n){a[i++]=nextInt();}  return a;}
    long[] nextLongArray(int n)        {long[]a= new long[n];  int i=0;while(i<n){a[i++]=nextLong();} return a;}
    int[]  nextIntArrayOneBased(int n) {int[] a= new int[n+1]; int i=1;while(i<=n){a[i++]=nextInt();} return a;}
    long[] nextLongArrayOneBased(int n){long[]a= new long[n+1];int i=1;while(i<=n){a[i++]=nextLong();}return a;}
    void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}
}