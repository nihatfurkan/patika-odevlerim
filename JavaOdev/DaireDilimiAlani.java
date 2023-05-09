import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {

        double pi =3.14;
        double r , a , alan ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextDouble();

        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = inp.nextDouble();

        alan =(pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı : " + alan);
    }
}
