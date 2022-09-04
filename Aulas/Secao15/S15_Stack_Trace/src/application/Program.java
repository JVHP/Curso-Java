package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("*****METHOD1 START*****");
        method2();
        System.out.println("*****METHOD1 END*****");
    }

    public static void method2() {
        System.out.println("*****METHOD2 START*****");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid position");
            ex.printStackTrace();
        } catch (InputMismatchException ex) {
            System.out.println("Input error");
            ex.printStackTrace();

        }
        System.out.println("*****METHOD2 END*****");
        System.out.println("End of program");

        sc.close();
    }
}
