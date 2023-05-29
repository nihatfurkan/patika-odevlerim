import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main (String[] args){

        int mat,fizik,turkce,kimya,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scanner.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = scanner.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = scanner.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik = scanner.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = scanner.nextInt();

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama <= 55 ) {
            System.out.println("Sınıfta Kaldınız");

        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }

        System.out.println("Ortalamınız :" + ortalama  );
    }
}

