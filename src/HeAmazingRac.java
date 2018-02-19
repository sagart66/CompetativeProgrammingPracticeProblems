import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class HeAmazingRac {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testcases=Integer.parseInt(br.readLine().replaceAll("\\s",""));
        for(int l=0;l<testcases;l++) {

            int n = Integer.parseInt(br.readLine().replaceAll("\\s",""));

            String[] m = br.readLine().split(" ");
            int a[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i + 1] = Integer.parseInt(m[i]);
            }

            int winner = getValue(a);
            System.out.println(winner);
        }
    }
    public static int getValue(int []a){
        int b[]=new int[a.length];
        int maxLeft;
        int maxRight;
        for(int i=1;i<a.length;i++){
            maxLeft=i;
          for(int j=i-1;j>=1;j--){
              if(a[j]>=a[i]){
                  maxLeft=j;
                  break;
              }
          }
          maxRight=i;
          for(int j=i+1;j<a.length;j++){
              if(a[j]>=a[i]){
                  maxRight=j;
                  break;
              }
          }
          b[i]=i*(maxRight-maxLeft);
      }
         maxLeft=Integer.MIN_VALUE;
        int imax=0;
        for(int i=1;i<b.length;i++){
            if(b[i]>maxLeft){
                maxLeft=b[i];
                imax=i;
            }
        }
        return imax;
    }
}
