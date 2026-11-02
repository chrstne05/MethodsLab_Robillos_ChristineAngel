/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class MethodsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        intro();

        System.out.println();
        System.out.println("===== ARITHMETIC =====");
        System.out.println();
        System.out.println("-- Enter two numbers --");
        System.out.print("1st number: ");
        int first = input.nextInt();
        System.out.print("2nd number: ");
        int second = input.nextInt();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Addition: " + task2a(first, second));
        System.out.println("Subtraction: " + task2b(first, second));
        System.out.println("Multiplication: " + task2c(first, second));
        if (second != 0) {
            System.out.println("Division: " + task2d(first, second));
        } else {
            System.out.println("Division: Invalid.");
        }
        System.out.println("------------------------------");

        System.out.println();
        System.out.println();
        System.out.println("===== FACTORIAL =====");

        System.out.print("Enter number for factorial: ");
        int f = input.nextInt();

        System.out.println();
        System.out.println("--------------------------------");

        if (f < 0 || f > 12) {
            System.out.println("Answer: Invalid");
        } else {
            System.out.println("Answer: " + task3(f));
        }
        System.out.println("--------------------------------");

        System.out.println();
        System.out.println();
        System.out.println("===== SUM =====");
        System.out.println("-- Enter five numbers --");

        System.out.print("Enter a: ");
        int one = input.nextInt();

        System.out.print("Enter b: ");
        int two = input.nextInt();

        System.out.print("Enter c: ");
        int three = input.nextInt();

        System.out.print("Enter d: ");
        int four = input.nextInt();

        System.out.print("Enter e: ");
        int five = input.nextInt();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Answer: " + task4(one, two, three, four, five));
        System.out.println("--------------------------------");

        System.out.println();
        System.out.println();
        System.out.println("===== PRIME =====");

        System.out.print("Enter value: ");
        int p = input.nextInt();

        System.out.println();
        System.out.println("--------------------------------");
        if (task5(p)) {
            System.out.println("Answer: " + p + " is prime.");
        } else {
            System.out.println("Answer: " + p + " is not prime.");
        }
        System.out.println("--------------------------------");

        System.out.println();
        System.out.println();
        System.out.println("===== MAXIMUM =====");

        System.out.print("How many values? ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Invalid number of values.");
        } else {

            System.out.println();
            System.out.println("-- Enter the values --");

            System.out.print("Value a: ");
            int maximum = input.nextInt();
            int i = 2;

            while (i <= count) {
                System.out.print("Value " + (char) ('a' + i - 1) + ": ");
                int value = input.nextInt();

                if (value > maximum) {
                    maximum = value;
                } else {
                    maximum = maximum;
                }
                i++;
            }

            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("Answer: " + maximum);
            System.out.println("--------------------------------");

            System.out.println();
            System.out.println();
            System.out.println("===== GCD AND LCM =====");
            System.out.println("-- Enter two positive numbers --");

            System.out.print("1st number: ");
            int g = input.nextInt();

            System.out.print("2nd number: ");
            int cd = input.nextInt();

            System.out.println();
            System.out.println("---------------------------------");
            if (g > 0 && cd > 0) {
                System.out.println("GCD: " + task7(g, cd));
                System.out.println("LCM: " + taskk7(g, cd));
            } else {
                System.out.println("Invalid input.");
            }
            System.out.println("---------------------------------");

            System.out.println();
            System.out.println();
            System.out.println("===== RECURSIVE FACTORIAL =====");

            System.out.print("Enter a number: ");
            int fact = input.nextInt();

            System.out.println();
            System.out.println("---------------------------------");
            if (fact < 0 || fact > 12) {
                System.out.println("Invalid");
            } else {
                System.out.println("Answer: " + chal1(fact));
            }
            System.out.println("---------------------------------");

            System.out.println();
            System.out.println();
            System.out.println("===== RECURSIVE FACTORIAL =====");

            System.out.print("Enter a number: ");
            fact = input.nextInt();

            System.out.println();
            System.out.println("---------------------------------");
            if (fact < 0 || fact > 12) {
                System.out.println("Invalid");
            } else {
                System.out.println("Answer: " + chal1(fact));
            }
            System.out.println("---------------------------------");

            System.out.println();
            System.out.println();
            System.out.println("===== FIBONACCI =====");

            System.out.print("Enter a number: ");
            int fi = input.nextInt();

            System.out.println();
            System.out.println("---------------------------------");
            if (fi < 0 || fi > 45) {
                System.out.println("Invalid");
            } else {
                System.out.println("Answer: " + chal2(fi));
            }
            System.out.println("---------------------------------");

            System.out.println();
            System.out.println("===== PALINDROME =====");

            input.nextLine();

            System.out.print("Enter a word: ");
            String pp = input.nextLine();

            if (chal3(pp)) {
                System.out.println("Answer: " + pp + " is a palindrome.");
            } else {
                System.out.println("Answer: " + pp + " is not a palindrome.");
            }

            System.out.println();
            System.out.println("===== THANK YOU! I HOPE THIS HELPS :) =====");

        }

    }

    static void intro() {
        System.out.println("---------- WELCOME TO MATH PROGRAM! ----------");
    }

    static int task2a(int a, int b) {
        return a + b;
    }

    static int task2b(int a, int b) {
        return a - b;
    }

    static int task2c(int a, int b) {
        return a * b;
    }

    static double task2d(double a, double b) {
        return a / b;
    }

    static int task3(int f) {
        if (f < 0) {
            return -1;
        } else {
            int fac = 1;
            int torial = 1;

            do {
                fac = fac * torial;
                torial++;
            } while (torial <= f);
            return fac;
        }
    }

    static int task4(int one, int two, int three, int four, int five) {
        int u = 0;

        u = one + two + three + four + five;

        return u;
    }

    static boolean task5(int p) {
        if (p <= 1) {
            return false;
        } else {
            int prime = 2;

            while (prime <= p / prime) {
                if (p % prime == 0) {
                    return false;
                } else {
                    prime++;
                }
            }
            return true;
        }

    }

    static int task6(int m, int aa, int x, int i, int mum) {
        int maximum = m;

        if (aa > maximum) {
            maximum = aa;
        }
        if (x > maximum) {
            maximum = x;
        }
        if (i > maximum) {
            maximum = i;
        }
        if (mum > maximum) {
            maximum = mum;
        }
        return maximum;
    }

    static int task7(int g, int cd) {

        while (cd != 0) {
            int temp = cd;
            cd = g % cd;
            g = temp;
        }

        return g;
    }

    static int taskk7(int aaaa, int bbbb) {

        return (aaaa / task7(aaaa, bbbb)) * bbbb;
    }

    static int chal1(int fact) {

        if (fact == 0 || fact == 1) {
            return 1;
        }

        return fact * chal1(fact - 1);
    }

    static int chal2(int fi) {

        if (fi == 0) {
            return 0;
        }

        if (fi == 1) {
            return 1;
        }

        return chal2(fi - 1) + chal2(fi - 2);
    }

    static boolean chal3(String pp) {
        if (pp == null) {
            return false;
        }

        String r = pp.toLowerCase();
        int ll = 0;
        int rr = r.length() - 1;

        while (ll < rr) {
            if (r.charAt(ll) != r.charAt(rr)) {
                return false;
            }
            ll++;
            rr--;
        }

        return true;
    }
}
