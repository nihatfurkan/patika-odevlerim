import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
//        Kullanılacak Değişkenler
        int n1,n2,select;

        Scanner hesap = new Scanner(System.in);
        System.out.print("ilk Sayıyı Giriniz :");
        n1 = hesap.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = hesap.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölüm");
        System.out.println("Seçiminizi Giriniz :");
        select = hesap.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Sonuç: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Sonuç: " + ((double) n1 / n2));
                }else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                    System.exit(0); // Programı sonlandır
                }
                break;
            default:
                System.out.println("Geçersiz Seçim. ");
                System.exit(0); // Programı sonlandır
        }
    }
}
