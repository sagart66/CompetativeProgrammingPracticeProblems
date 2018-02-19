import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class HrGratestRectangleFormed {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Integer area[]=new Integer[n];
        Arrays.fill(area,1);
        int heigth[]=new int[n];
        boolean val[]=new boolean[n];
        boolean val1[]=new boolean[n];
        Arrays.fill(val,true);
        Arrays.fill(val1,true);
        for(int i=0;i<n;i++){
            heigth[i]=input.nextInt();
            }
            for(int i=0;i<n;i++){
                inner:for(int j=i+1;j<n;j++){
                    if(val[i] && heigth[i]<=heigth[j]){
                        area[i]+=1;
                    }else {
                        val[i]=false;
                        break inner;
                    }
                }
               inner1: for(int k=i-1;k>=0;k--){
                    if(val1[i] && heigth[i]<=heigth[k]) {
                        area[i] += 1;
                    }
                    else {
                        val[i]=false;
                        break inner1;
                    }
                }
            }
            for(int i=0;i<n;i++)
                area[i]=area[i]*heigth[i];
        int max=Collections.max(Arrays.asList(area));
        System.out.println(max);
            /*for(int i:area)
                System.out.println(i);

*/





        }



    }

