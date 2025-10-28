/* Problem: Number of Set Bits

Problem Statement:
Given a non-negative integer n, find the number of set bits (1s) in the binary representation of that number. */
import java.util.*;
public class No_of_1bit{
    public static void Main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(No_of_1Bits(n));
    }
    public static int No_of_1Bits(int n){
        int count=0;
        while(n!=0){
            if(n&1){ // we can also do n%2!=0 also same output 
                count++;
            }
            n=n>>1;

        }
        return count;
    }
}