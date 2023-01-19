//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
        int count1=0,count2=0;
        int p=A,q=B,r=C,s=D;
        while(q>s)
        {
            q/=2;
            count1++;
        }
        while(r<p){
            p/=2;
            count1++;
        }
        while(B>C)
        {
            B/=2;
            count2++;
        }
        while(D<A){
            A/=2;
            count2++;
        }
        return Math.min(count1,count2);
        
    }
   
}
 