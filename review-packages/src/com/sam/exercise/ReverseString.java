package com.sam.exercise;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString("Adanada");
    }
    public static void ReverseString(String str){
        String rts= "";
        for(int i=str.length()-1;  i>=0;  i--){
            rts = rts + str.charAt(i);
        }
        System.out.println("rts = " + rts);
    }
}
