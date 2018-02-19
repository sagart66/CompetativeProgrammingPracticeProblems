import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*Given an array of size n, find all elements in array that appear more than n/k times.*/
public class GfgElementsAppearMoreThanNByKtimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for (int j = 0; j < testcases; j++) {
            int n = input.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = input.nextInt();
            int k = input.nextInt();
            System.out.println(count(a, n, k));
        }
    }

    static int count(int a[], int n, int k) {
    int count=0;int l=n/k;int val=0;
        LinkedHashMap<Integer,Integer>myhash=new LinkedHashMap<>();
        for(int i:a) {
            if (myhash.containsKey(i))
                val=myhash.get(i)+1;
            else val=1;
            myhash.put(i, val);
            if (val > l)
                count++;
        }
            return count;


    }



}
