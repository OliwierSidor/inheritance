package pl.sda.arp4.wyjaztkiZadanie;
//        Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b.
//        Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.
//        Wariant 1: Zastosuj instrukcję if
//        Wariant 2: Zastosuj instrukcję try-catch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą: ");
        int liczbaA = scanner.nextInt();
        System.out.println("Podaj pierwszą drugą całkowitą: ");
        int liczbaB = scanner.nextInt();

            if (liczbaB == 0) {
                System.out.println("nigdy cholero nie dziel przez zero :)");
            } else {
                double wynikDzielenia = liczbaA/liczbaB;
                System.out.println("Wynik: " + wynikDzielenia);
            }
    }
}
