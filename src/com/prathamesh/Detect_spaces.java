package com.prathamesh;
import java.util.Scanner ;
public class Detect_spaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String mystring = sc.nextLine();
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

    }
}
