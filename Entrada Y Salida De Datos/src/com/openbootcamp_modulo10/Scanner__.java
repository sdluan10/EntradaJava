package com.openbootcamp_modulo10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner__ {

    public static void main(String[] args) {

        try {

            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.print("mete dos numeros: ");

                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("numeros invalidos");
                }
            } while (!ok);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


//Luis Jose