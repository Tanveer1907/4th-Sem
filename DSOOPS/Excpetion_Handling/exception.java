package Excpetion_Handling;

public class exception {
    public static void main(String[] args) {
        int age = 15;
        if(age<10){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }
}

