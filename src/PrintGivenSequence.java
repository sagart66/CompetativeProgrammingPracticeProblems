/* softskill question
1 17 18 19 20
2 3  14 15 16
4 5 6 13 12
7 8 9 10 11
*/
public class PrintGivenSequence {
    public static void main(String[] args) {
        int t=0;int z=21;int t1=0; int l=0;int k;
        for(int i=1;i<5;i++){
            k=5;
            for(int j=0;j<i;j++){
                t+=1;
                System.out.print(t+" ");
                k--;
            }
             l=0;t1=z;
            for(int j=(k);j>0;j--){
                if(++l==1){
                    z=t1-j;
                }
                System.out.print(t1-j+" ");
            }

            System.out.println();
        }
    }
}
