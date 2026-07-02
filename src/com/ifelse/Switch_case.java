package com.ifelse;
import java.util.Scanner ;
public class Switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are going to become adult");
                break;

            case 21:
                System.out.println("you are going to get job");
                break;

            case 60:
                System.out.println("enjoy your life");
                break;

            default:
                System.out.println("thanks");
        }
    }
}
