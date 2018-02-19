import java.util.Scanner;
public class FindAmstrongNumbersBelowJ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=10;i<=n;i++){
            if(isAmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isAmstrongNumber(int z){
        String str=z+"";
        int sum=0;
        for(int i=0;i<str.length();i++){
            int p=Integer.parseInt(str.charAt(i)+"");
            sum+=Math.pow(p,str.length());
        }
        if(sum==z)
            return true;
        return false;
    }
}

