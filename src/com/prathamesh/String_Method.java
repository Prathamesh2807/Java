package com.prathamesh;

public class String_Method {
    public static void main(String[] args){
        String name = "Prathamesh" ;
        System.out.println(name);
        int a = name.length();
        System.out.println("the length of the string is : " + a);
        String b = name.toLowerCase();
        System.out.println(b);
        String c = name.toUpperCase();
        System.out.println(c);
        String nonTrimmed = "      harry     ";
        System.out.println(nonTrimmed);
        String Trimmed = nonTrimmed.trim();
        System.out.println(Trimmed);
        System.out.println(name.substring(2,10));
        System.out.println(name.replace("Prathamesh","amey"));
        System.out.println(name);
        System.out.println(name.startsWith("P"));
        System.out.println(name.endsWith("h"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("Pra"));
        System.out.println(name.lastIndexOf("a"));
    }
}
