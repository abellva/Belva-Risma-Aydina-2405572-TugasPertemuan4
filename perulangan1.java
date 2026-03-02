import java.util.Scanner;
public class perulangan1 {
    public static void main (String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println("masukkan nilai n: ");
        int n = myObj.nextInt();

        for(int i = 1; i<= n; i++){
            System.out.println("Saya senang belajar bahasa Java");

        }
    }
}
//continue di perulangan digunakan untuk melewati satu iterasi dan melanjutkan ke iterasi berikutnya, 
// sedangkan break digunakan untuk keluar dari perulangan secara keseluruhan.
//tapi itu harus ada di dalam perulangan dan kondisi tertentu, jika tidak maka akan terjadi error.