package FA_Practice;

import Recursion.fibonacci;

public class FA_1 {
    // sum of digits
    static int sum_digits(int n){
        if(n==0) return 0;
        return n%10 + sum_digits(n/10);
    }

    //count_digits
    static int count_digits(int n){
        if(n==0) return 0;
        return 1+count_digits(n/10);
    }
    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void print_fib(int n){
        for(int i = 0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        
    }
    public static void main(String[] args){
        System.out.println("Sum of digits: "+sum_digits(1234));
        System.out.println("No. of digits: "+ count_digits(90876));
        System.out.println("Fibonacci series: ");
        print_fib(5);
    }
}
