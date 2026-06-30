package com.prathamesh;
import java.util.Scanner ;
public class Replace_str {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");

        String name = sc.nextLine();
        String updated_name = name.replace(" " , "_");
        System.out.println("the updated string is : " + updated_name.toLowerCase());
        //PROBLEM 3
        String letter = "DEAR <|name|> , thanks a lot";
        System.out.println(letter.replace("<|name|>" ,"Prathamesh"));
    }
}
