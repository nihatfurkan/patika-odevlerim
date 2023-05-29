import java.util.Scanner;
public class EtkinlikÖnerisi {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz :");
        int sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz :");

        }else if (sicaklik >=5 && sicaklik <=15) {
            System.out.println("Sinemaya gidebilirsiniz :");

        }else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik yapabilirsiniz :");

        }else {
            System.out.println("Evde oturabilirsin :)) :");
        }
    }
}
