package homework3q1;
//koşul 1 cba > abc olacak
//koşul 2 abc asal sayı olacak
//koşul 3 cba asal sayı olacak
//koşul 4 ab asal sayı olacak
//koşul 5 bc asal sayı olacak
//koşul 6 cb asal sayı olacak
//koşul 7 ba asal sayı olacak
//113 sayısı bu koşulları sağlamaktadır!

public class Homework3Q1 {

    static int sayi = 113;
    static int reversed = 0;

    public static int reverse() {

        while (sayi != 0) {
            int digit = sayi % 10;
            reversed = reversed * 10 + digit;
            sayi /= 10;
        }

        return reversed;
    }

    public static void findPrimeNumbers() {
        reverse();
        sayi = 113;
        int firstDigit = sayi / 100;
        int lastDigit = sayi % 10;
        int reversedFirstDigit = reversed / 100;
        int ab = (sayi - lastDigit) / 10;
        int bc = sayi - (firstDigit * 100);
        int cb = reversed / 10;
        int ba = reversed - (reversedFirstDigit * 100);
        if (sayi % 10 == 0) {
            System.out.println("Bu sayinin tersi alinamaz.");
        }

        int primeCount = 0;
        if (reversed > sayi) {

            for (int i = 2; i < (sayi / 2); i++) {
                if (sayi % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }
            for (int i = 2; i < (reversed / 2); i++) {
                if (reversed % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }
            for (int i = 2; i < (ab / 2); i++) {
                if (ab % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }
            for (int i = 2; i < (bc / 2); i++) {
                if (bc % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }

            for (int i = 2; i < (cb / 2); i++) {
                if (cb % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }
            for (int i = 2; i < (ba / 2); i++) {
                if (ba % i == 0) {
                    primeCount++;

                }
                if (primeCount > 0) {
                    System.out.println("Sayi verilen sartlari karsilamiyor.");
                    break;
                }
            }
            System.out.println(sayi + " sayisi bu kosullari saglamaktadir!");
        } else {
            System.out.println(sayi + " sayisi verilen sartlari karsilamiyor.");
        }
    }

    public static void main(String[] args) {

        findPrimeNumbers();

    }

}
