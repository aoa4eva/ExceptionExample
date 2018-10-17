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
        }
        }while(exceptionThown);
    }
}
