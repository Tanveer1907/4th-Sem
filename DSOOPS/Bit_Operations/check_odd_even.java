package Bit_Operations;

public class check_odd_even {
    public static void check(int n){
        if((n&1)==0){
            System.out.println("even");
        }
        else{  
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        check(n);
    }
}
