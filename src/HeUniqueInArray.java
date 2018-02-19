import java.util.LinkedHashSet;
import java.util.Scanner;
public class HeUniqueInArray {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int j=0;j<testcases;j++) {
            int n = input.nextInt();
            int m = input.nextInt();
            LinkedHashSet<Integer> l = new LinkedHashSet<>();
            for (int i = 0; i < n; i++) {
                l.add(input.nextInt());
            }
            int p = l.size();
            if (p == m)
                System.out.println("Good");
            else if (p > m)
                System.out.println("Average");
            else
                System.out.println("Bad");


        }




    }
}
