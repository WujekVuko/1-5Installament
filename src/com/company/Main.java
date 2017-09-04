package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            double price = 0;
            int installmentsCount = 0;
            Scanner in = new Scanner(System.in);
            while (price < 100 || price > 10000) {
                System.out.println("Cena musi się zawierać w przedziale od 100 do 10000");
                System.out.println("Podaj cenę towaru: ");
                price = in.nextDouble();
            }
            while (installmentsCount < 6 || installmentsCount > 48) {
                System.out.println("Liczba rat musi się zawierać w przedziale od 6 do 48");
                System.out.println("Podaj liczbę rat: ");
                installmentsCount = in.nextInt();
            }


            InstallmentHeight value = new InstallmentHeight(price, installmentsCount);
            value.setRate();
            System.out.println(value.getPower());
            System.out.println(value.getQ());

            System.out.printf("Rata wyniesie %,.2f %s", value.getRate(), "zł");

        } catch (InputMismatchException e) {
            System.out.print("To nie jest liczba.");

        }
    }
}

