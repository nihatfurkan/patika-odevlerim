

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = scanner.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = scanner.nextInt();

        if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 18)) {
            burc = "Kova";
        } else if ((ay == 2 && gun >= 19) || (ay == 3 && gun <= 20)) {
            burc = "Balık";
        } else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            burc = "Koç";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 20)) {
            burc = "Boğa";
        } else if ((ay == 5 && gun >= 21) || (ay == 6 && gun <= 21)) {
            burc = "İkizler";
        } else if ((ay == 6 && gun >= 22) || (ay == 7 && gun <= 22)) {
            burc = "Yengeç";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            burc = "Aslan";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            burc = "Başak";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            burc = "Terazi";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            burc = "Akrep";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            burc = "Yay";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            burc = "Oğlak";
        } else {
            burc = "Geçersiz tarih!";
        }

        System.out.println("Burcunuz: " + burc);
    }
}
