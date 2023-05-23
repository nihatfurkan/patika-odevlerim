import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main (String[] args) {
        String userName, password;

        Scanner grs = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = grs.nextLine();

        System.out.print("Şifreniz: ");
        password = grs.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yapıldı");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String cevap = grs.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifreyi girin: ");
                String yeniSifre = grs.nextLine();

                if (yeniSifre.equals(password)) {
                    System.out.println("Hatalı giriş, şifreyle aynı olamaz. Şifre oluşturulamadı.");
                } else {
                    password = yeniSifre;
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
    }
}
