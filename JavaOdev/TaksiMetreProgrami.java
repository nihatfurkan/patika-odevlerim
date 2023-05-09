import java.util.Scanner;

public class TaksiMetreProgrami {
    public static void main(String[] args) {

//        Değişkenleri tanımlıyorum
        double km, perKm = 2.20, ucret, startPrice = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz : ");
        km = scanner.nextDouble();

        ucret = (km * perKm);
        ucret += startPrice;  // ucret = ucret + startPrice;

        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Toplam Tutar : " + ucret);

    }
}
