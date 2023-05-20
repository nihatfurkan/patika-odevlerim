 import java.util.Scanner;

public class ManaKasaProgrami {
    public static void main(String[] args) {

        double armutKgFiyatı = 2.14;
        double elmaKgFiyatı = 3.67;
        double domaKgFiyatı = 1.11;
        double muzKgFiyatı =  0.95;
        double patlicanKgFiyatı= 5.00;

        double armutKg, elmaKg, domaKg, muzKg, patlicanKg;
        double toplamTutar;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilogram? : ");
        armutKg = scanner.nextDouble();

        System.out.print("Elma kaç kilogram? : ");
        elmaKg = scanner.nextDouble();

        System.out.print("Domates kaç kilogram? : ");
        domaKg = scanner.nextDouble();

        System.out.print("Muz kaç kilogram? : ");
        muzKg = scanner.nextDouble();

        System.out.print("Patlican kaç kilogram? : ");
        patlicanKg = scanner.nextDouble();

        toplamTutar = (armutKg * armutKgFiyatı) + (elmaKg * elmaKgFiyatı) + (domaKg * domaKgFiyatı) + (muzKg * muzKgFiyatı) + (patlicanKg * patlicanKgFiyatı);
        System.out.println("Toplam tutar : " + toplamTutar + "TL");
    }
}
