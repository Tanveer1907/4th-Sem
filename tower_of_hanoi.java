package Recursion;

public class tower_of_hanoi {
    static void toh(int n, char src, char helper, char dest){
        if(n==0) return;
        toh(n-1, src, dest, helper);
        System.out.println("Move disk "+n +" from "+src +" to "+ dest);
        toh(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        toh(3,'a','B','C');
    }
}