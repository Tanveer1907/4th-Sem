package Recursion;

public class recursion{
    public static void main(String[] args){
        int n = 10;
        print_reverse(n);
        System.out.println();
        print_normal(n);
    }
    public static void print_reverse(int n){
        if(n == 0) return;
        
        System.out.print(n+" ");
        print_reverse(n-1);
    }
    public static void print_normal(int n){
        if(n==0) return;
        print_normal(n-1);
        System.out.print(n+" ");

    }
}
