import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class HeBattleField {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine().replaceAll(" ", ""));
        int n, sum;
        int array[];
        String a[];
        for (int z = 0; z < m; z++) {
            n = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            a = br.readLine().split("");
            array = new int[n];
            sum = 0;
            for (int i = 0; i < n; i++) {
                array[i] = (a[i].equalsIgnoreCase("K")) ? 1 : 0;
                sum += array[i];
            }
            int sum1=0;
            for(int i=0;i<sum;i++)
                sum1+=array[i];
            int cl=sum1;
            System.out.println(sum1);
            for(int i=1;i<array.length;i++){
                sum1=sum1-array[i-1]+array[(i+sum-1)%array.length];
                if(sum1>cl)
                    cl=sum1;
            }
            System.out.println(sum+" "+cl+" "+(sum-cl));
        }
    }
}
