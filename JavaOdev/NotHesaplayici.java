
import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);

//        Double, ondalık sayıları (noktalı sayıları) temsil etmek için kullanılan bir veri türüdür.
//        tam sayılarla ilgili işlemler için int kullanılırken, ondalık sayılarla ilgili işlemler için double veya float veri tipleri tercih edilir.

        System.out.print("Matematik sınav puanınız: ");
        double matematik = not.nextDouble();

        System.out.print("Fizik sınav puanınız: ");
        double fizik = not.nextDouble();

        System.out.print("Kimya sınav puanınız: ");
        double kimya = not.nextDouble();

        System.out.print("Türkçe sınav puanınız: ");
        double turkce = not.nextDouble();

        System.out.print("Tarih sınav puanınız: ");
        double tarih = not.nextDouble();

        System.out.print("Müzik sınav puanınız: ");
        double muzik = not.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not ortalamanız: " + ortalama);

//        ?: operatörü, koşullu ifadelerin tek satırda yazılmasını sağlayan bir operatördür. Sol tarafta yer alan koşul doğru ise ? ile ayrılan kısım çalışır, yanlış ise : ile ayrılan kısım çalışır.
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
