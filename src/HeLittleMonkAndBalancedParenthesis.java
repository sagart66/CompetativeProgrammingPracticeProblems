import java.io.*;
import java.util.LinkedList;

public class HeLittleMonkAndBalancedParenthesis {
    public static void main(String[] args) {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out =new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        int n=in.nextInt();int k;
        LinkedList<Integer> mystack=new LinkedList();
        mystack.addLast(Integer.MIN_VALUE);
        int maxsize=0;
        int size=0;int prev=0;
        for(int i=0;i<n;i++){
            k=in.nextInt();
            if(k>0 && mystack.isEmpty()) {
                mystack.addLast(Integer.MIN_VALUE);
                prev=0;
                mystack.addLast(k);
                size=0;
            }
            else if(k>0){
                mystack.addLast(k);
            }
            else if(!mystack.isEmpty() && mystack.getLast()==Math.abs(k)){
                mystack.removeLast();
                size+=2;
                if(mystack.getLast()==Integer.MIN_VALUE) {
                    size += prev;
                    prev=size;
                    maxsize=(size>prev)?size:prev;
                    size=0;
                }
            }
            else if(!mystack.isEmpty() && mystack.getLast()!=Math.abs(k)){
                if(size>maxsize)
                    maxsize=size;
                size=0;
                mystack.clear();
            }

            int l=(size>prev)?size:prev;
            maxsize=(l>maxsize)?l:maxsize;


        }

   System.out.println(maxsize);



    }

}
/* THIS IS SIMPLE SOLUTION  HAVE A LOOK AT IT
    #include<bits/stdc++.h>
    using namespace std;
    int main()
    {
        int n;
        cin>>n;
        int b[200005];
        for(int i=1; i<=n; i++)
            cin>>b[i];
        stack<int>s;
        int result=0;
        s.push(0);
        for(int i=1; i<=n; i++)
        {
            if(b[i]>0)s.push(i);
            else
            {
                int index=s.top();
                s.pop();
                if(b[index]==-b[i])
                {
                    if(!s.empty())
                        result=max(result,i-s.top());
                }
                else
                    s.push(i);
            }
        }
        cout<<result<<"\n";
        return 0;
    }
 */