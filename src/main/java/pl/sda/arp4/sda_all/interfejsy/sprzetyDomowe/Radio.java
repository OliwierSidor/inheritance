package pl.sda.arp4.interfejsy.sprzetyDomowe;

public class Radio implements UrządzenieWłączalne, UrządzenieWyłączalne {
    public void wlacz() {
        System.out.println("Uruchamiam radio. tralalala muzyczka gra");
    }

    public void wylacz() {
        System.out.println("Wyłączam radio");
    }
}
