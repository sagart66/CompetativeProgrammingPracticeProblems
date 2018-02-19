//Arrays question hacker earth
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HeHamiltonion {
    public static void main(String[] args) throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        final int n=Integer.parseInt(input.readLine());
        LinkedList<Integer>a=new LinkedList<>();
        String[] m=  input.readLine().split(" ");

        for(int i=0;i<n;i++){
            a.add(Integer.parseInt(m[i]));
        }
        getNumbers(a);
    a.toArray();
    for(int i:a)
        System.out.print(i+" ");


    }
    public static void getNumbers(LinkedList<Integer> a){

        int k=0;int p;
        for(int i=0;i<a.size();i++){
            if(k!=i){
                if(a.get(k)<a.get(i)){
                    a.remove(k);
                    i=(i-1)>0?i-2:i-1;
                    k=(k>0)?k-1:k;
                }else{
                    k++;
                }
            }
        }




    }



}
