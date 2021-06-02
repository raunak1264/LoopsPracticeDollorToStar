package com.company;

import java.util.Scanner;

public class Main {

    private static int i;

    public static void main(String[] args) {
//	// write your code here.pdb filw
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int J = 0; J < i; J++) {

                System.out.print("$");

            }

            System.out.print("\n");
            for (int k = n; k >= i; k--) {
                System.out.print("*");

            }
        }
//        for (int k = 0; k < i; k++) {
//            System.out.println("*");
//        }
    }
        }

// for (int k = 0; k < i; k++){
//        System.out.println("\n*");




//bro