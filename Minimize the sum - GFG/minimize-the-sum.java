//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    long minimizeSum(int N, int arr[]) {
        int sum=0;
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        for(int i=0;i<N;i++){
            q.add(arr[i]);
        }
        while(q.size()>1){
            int a=q.poll();
            int b=q.poll();
            int c=a+b;
            sum=sum+c;
            q.add(c);
        }
    
        return sum;
    }
}

//{ Driver Code Starts.

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0; i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            long ans = obj.minimizeSum(n, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends