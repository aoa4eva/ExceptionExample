package me.afua;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        boolean exceptionThown = true;
        do{
        int i=0;
        Scanner sc = new Scanner(System.in);
        exceptionThown=false;
        try{
            System.out.println("Enter a number");
            i=sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("This is an exception");
            exceptionThown = true;
        }finally {
            System.out.println("This will be shown regardless of whether an exception is thrown");
        }
        }while(exceptionThown);


        System.out.println("This line will not be displayed if an exception is thown.");
    }
}
