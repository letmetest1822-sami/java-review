package com.sam.core;

public class Methods {

    public void methodA(){
        System.out.println("method A is called");
    }

    public void methodA(String str){

        System.out.println("methodA(String str) is called");
   }

   public String methodB() {

        return "methodB() is called";
   }

   public String  methodB(int x){
        return "methodB(int x) is called";
   }

   public static void methodC(){                            //belongs to class   no dependency on instance variables
       System.out.println("methodC() is called");
   }


}