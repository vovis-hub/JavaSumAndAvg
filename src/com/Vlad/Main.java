package com.Vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }
        public static void inputThenPrintSumAndAverage()  {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            int sum = 0;
            long avg = 0;
            System.out.println("Enter a number");
            while (true) {
                count++;
                boolean flag = scanner.hasNextInt();
                if (flag) {
                    int num = scanner.nextInt();
                    sum += num;
                    avg = Math.round((double) (sum / count));
                    System.out.println("Enter another number ('f' to finish)");
                } else {
                    scanner.nextLine();
                    break;
                }

            }
            System.out.println("SUM = "+ sum + " AVG = "+ avg);

        }

}
