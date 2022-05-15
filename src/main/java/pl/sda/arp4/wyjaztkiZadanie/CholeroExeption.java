package pl.sda.arp4.wyjaztkiZadanie;

public class CholeroExeption extends RuntimeException{

    public CholeroExeption() {
        super("Nigdy cholero nie dziel przez zero :)");
    }
}
