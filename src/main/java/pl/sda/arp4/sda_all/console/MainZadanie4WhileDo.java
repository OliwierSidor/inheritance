package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4WhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj początek zakresu:");
        int poczatekZakresu = scanner.nextInt();

        System.out.println("podaj koniec zakresu");
        int koniecZakresu = scanner.nextInt();
        if (poczatekZakresu > koniecZakresu) {
            System.out.println("Podałeś błędne dane");
        }
        System.out.println("podaj dzielnik:");
        int dzielnik = scanner.nextInt();
        int i = poczatekZakresu;
        while (i < koniecZakresu + 1) {
            i++;
            if (i % dzielnik == 0) {
                System.out.println(i);
            }
        }
    }
}
