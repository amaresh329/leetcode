//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        
        int mod = (int)(1000000007);
        
        //if number itself is 0 then 0*any no is always 0 hence return 0
        
        if (N==0) return 0;
        
        //any no to the power 0 is always 1
        //break case
        if (R==0) return 1;
        
      //if power is divided by 2 then we can calculate the N^(R/2)
      //and we know that (N^(R/2))^2=N^R which is our required ans
      
        if (R%2==0){
           long ans = power(N, R/2);
         return (ans%mod * ans%mod ) % mod;
        }
        
        //if power is not divided by 2 then power -1 will be divided by 2 and 
        //we can calculate it like the case where power is divided by 2 and 
        //after calculating we can multiply it by N becoz we have subtracted 1 from R
        
        else {
            long ans = power(N, (R-1)/2);
              return (N%mod*ans%mod * ans%mod )%mod;
        }
        
    }

}