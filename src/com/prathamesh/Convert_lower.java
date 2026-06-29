package com.prathamesh;
import java.util.Scanner ;
public class Convert_lower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th name : ");
        String name = sc.next();
        String name_new = name.toLowerCase();
        System.out.println(name_new);
        System.out.println(name.toLowerCase());
    }

}
