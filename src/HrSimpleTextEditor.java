//this is hackerRank problem Topic: Stack
import java.util.Scanner;
import java.util.LinkedList;
public class HrSimpleTextEditor {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        LinkedList<String> addedStack = new LinkedList<>();
        LinkedList<String> deledtedStack = new LinkedList<>();
        LinkedList<Integer> operationStack = new LinkedList<>();
        String a = new String();
        int v=input.nextInt();

        while (v>0) {
            int n = input.nextInt();
//append operation 1
            if (n == 1) {
                String p = input.next();
                a = a + p;
                addedStack.addLast(p);
                operationStack.addLast(1);
            }
            //delete operation
            else if (n == 2) {
                int q = input.nextInt();
                int l = a.length() - q;
                String z = a.substring(l, a.length());
                a = a.substring(0, l);
                operationStack.addLast(2);
                deledtedStack.addLast(z);
            } else if (n == 3) {
                int k = input.nextInt();
                String z1 = a.substring(k - 1, k);
                System.out.println(z1);
            } else if (n == 4 && !operationStack.isEmpty()) {
                int h = operationStack.removeLast();
                if (h == 1) {

                    String w = addedStack.removeLast();
                    int l = a.length() - w.length();
                    a = a.substring(0, l);
                } else if (h == 2) {
                    String t = deledtedStack.removeLast();
                    a = a + t;
                }
            }

          //  System.out.println(a);
            v--;

        }

    }

}