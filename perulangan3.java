import java.util.Scanner;
public class perulangan3 {
    public static void main (String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.print("Masukkan angka a: ");
        int a = myObj.nextInt();
        
        System.out.print("Masukkan angka b: ");
        int b = myObj.nextInt();

        int gcd = hitungGCD(a, b);
        System.out.println("Pembagi Bersama Terbesar (GCD) dari " + a + " dan " + b + " adalah: " + gcd);
    }

    // Fungsi untuk menghitung GCD dengan algoritma Euclidean
    public static int hitungGCD(int a, int b) {
        int gcd = 1;
        int min = (a < b) ? a : b;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
}
}
