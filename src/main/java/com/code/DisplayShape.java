package com.code;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Draw the Rectangle.");
            System.out.println("2. Draw the Square Triangle.");
            System.out.println("3. Draw the Isosceles Rectangle.");
            System.out.println("0. Exit.");
            System.out.println("Enter Choice your.");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i=0; i < 10; i++){
                        System.out.println(" ");
                        for (int j=0; j< 5;j++){
                            System.out.print("\t"+ "*" + "\t");
                        }
                    }
                    break;
                case 2:
                    for (int i=0; i < 10; i++){
                        System.out.println(" ");
                        for (int j=0; j<=i;j++){
                            System.out.print("\t"+ "*" + "\t");
                        }
                    }
                    break;

                case 3:
                    for (int i=0; i < 10; i++){
                        System.out.println(" ");
                        for (int j=i; j< 10;j++){
                            System.out.print("\t"+ "*" + "\t");
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }
}
