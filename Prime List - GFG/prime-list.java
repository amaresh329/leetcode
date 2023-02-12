//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t;
        t=Integer.parseInt(in.readLine());
        while(t-->0){
            int n;
            n=Integer.parseInt(in.readLine());
            Node head,tail;
            String s[]=in.readLine().trim().split(" ");
            int num=Integer.parseInt(s[0]);
            head=new Node(num);
            tail=head;
            for(int i=1;i<n;i++){
                num=Integer.parseInt(s[i]);
                tail.next=new Node(num);
                tail=tail.next;
            }
            Solution ob=new Solution();
            Node temp=ob.primeList(head);
            while(temp!=null){
                out.print(temp.val+" ");
                temp=temp.next;
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
    public boolean isPrime(int n){
        if(n<=1)    return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)  return false;
        }
        return true;
    }
    public void makePrime(Node node){
        int val = node.val;
        int i=val-1,j=val+1;
        boolean flag = true;
        while(true){
            if(flag){
                if(isPrime(i)){
                    node.val = i;
                    break;
                }
                i--;
            }else{
                if(isPrime(j)){
                    node.val = j;
                    break;
                }
                j++;
            }
            flag = !flag;
        }   
    }
    Node primeList(Node head){
        //code here
        Node node = head;
        while(node!=null){
            if(isPrime(node.val)){
                node=node.next;
            }else{
                makePrime(node);
                node = node.next;
            }
        }
        return head;
    }
}
