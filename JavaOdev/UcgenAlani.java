import java.util.Scanner;

public class UcgenAlani {
    public static void main (String[] args) {

       double a, b, c, u, alan;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = scanner.nextDouble();

        System.out.print("2. Kenarı Giriniz : ");
        b = scanner.nextDouble();

        System.out.println("3. Kenarı Giriniz : ");
        c = scanner.nextDouble();

        u = (a + b +c) / 2 ;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}
