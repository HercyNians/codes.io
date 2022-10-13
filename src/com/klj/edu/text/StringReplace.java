package com.klj.edu.text;

public class StringReplace {
    public static void main(String[] args) {
        String str = "Java,Java,HelloWorld!";
        String newStr = str.replaceAll("Java","Klj");
        System.out.println(newStr);
    }
}
