import java.util.Scanner;

public class VKIHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vki;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Boyunuzu (metre cinsinden) giriniz:");
        boy = scanner.nextDouble();

        System.out.println("Kilonuzu (kg cinsinden) giriniz: ");
        kilo = scanner.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi (VKİ): " + vki);
    }
}
