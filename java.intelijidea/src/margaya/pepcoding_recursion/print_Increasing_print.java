package margaya.pepcoding_recursion;

import java.util.Scanner;

public class print_Increasing_print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }

    private static void printIncreasing(int n) {
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}

