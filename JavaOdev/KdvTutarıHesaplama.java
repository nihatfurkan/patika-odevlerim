import java.util.Scanner;
public class KdvTutarıHesaplama {
    public static void main (String[] args) {

        double para, kdvTutari, kdvliFiyat;

        Scanner hesap= new Scanner(System.in);  //System.in ifadesi  kullanıcıdan veri girişi yapılacağını belirtiyor.

        System.out.print("Para Miktarını Giriniz : ");
        para = hesap.nextDouble(); // kullanıcının girdiği para değeri para değişkenine atanır.

        double kdvOrani = (para > 1000) ? 0.08 : 0.18;
        kdvTutari = para * kdvOrani;
        kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz Tutar : " + para);
        System.out.println("KDV'li Tutar : " + kdvliFiyat);
        System.out.println("KDV Oranı : " + kdvOrani);


    }
}
