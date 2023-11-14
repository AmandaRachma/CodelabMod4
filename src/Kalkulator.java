import java.util.Scanner;
import java.lang.Math;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== Calculator ==");

        while (true) {
            System.out.println("\n1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator. Sampai jumpa!");
                break;
            }

            switch (choice) {
                case 1:
                    calculateSquareRoot(scanner);
                    break;
                case 2:
                    calculatePower(scanner);
                    break;
                case 3:
                    calculateNaturalLogarithm(scanner);
                    break;
                case 4:
                    calculateFactorial(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

        scanner.close();
    }

    private static void calculateSquareRoot(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Akar kuadrat dari " + number + " adalah " + result);
    }

    private static void calculatePower(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);
    }

    private static void calculateNaturalLogarithm(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        double number = scanner.nextDouble();
        double result = Math.log(number);
        System.out.println("Logaritma natural dari " + number + " adalah " + result);
    }

    private static void calculateFactorial(Scanner scanner) {
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Faktorial dari " + number + " adalah " + result);
    }
}