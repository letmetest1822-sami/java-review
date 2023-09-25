package com.sam.core.test;

import java.util.Scanner;

public class Control1 {
    public static void main(String[] args) {
        int account = 100;

        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter amount to transfer : ");
        int transfer = sc.nextInt();
        if ( transfer == 0) {
            System.out.println("Please enter an amount different from zero!");
        }else if (transfer > 200){
            System.out.println("You can not transfer more than 200$");
        }else {
            account = account + transfer;
            System.out.println("Your new balance is : " + account + "$");
        }


        /*
        Scanner number = new Scanner (System.in);

		System.out.print("Please enter a number : ");

		int a = number.nextInt();

		int b = a;

			if ( a == 0) {
				System.out.println("Please enter a number different from zero!");
			}
         */
    }
}
