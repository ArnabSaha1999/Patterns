package StarPattern;

import java.util.Scanner;

public class InvertedHalfStarDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows : ");
        int row = sc.nextInt();
        sc.close();
        for (int i = 0; i < row; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = 0; j < row - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < row - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
    *********
     *******
      *****
       ***
        *
*/
