import java.util.Scanner;

public class Taksimetre {
    static final int min = 20;
    static final int ilk = 10;
    static final double brc = 2.2;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Gittiğiniz mesafeyi KM cinsinden giriniz: ");
        int mesafe = scn.nextInt();
        double borc = (mesafe*brc)+ilk;
        double tutar = (borc>=20)? borc : min;
        System.out.println("Borcunuz: " +tutar);

    }
}
