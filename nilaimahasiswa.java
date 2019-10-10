
package daspro;

import java.util.Scanner;

public class nilaimahasiswa {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            double Nilai_akhir;

            System.out.print("masukkan NIM anda : "); String NIM = sc.nextLine();
            System.out.print("masukkan Nama anda : "); String Nama = sc.nextLine();
            System.out.print("masukkan UTS : "); Integer UTS = sc.nextInt();
            System.out.print("masukkan UAS : "); Integer UAS = sc.nextInt();
            Nilai_akhir = 0.4*UTS + 0.6*UAS;
            System.out.println("");
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.println("NIM : "+ NIM);
            System.out.println("Nama : "+ Nama);
            System.out.println("Nilai : "+ UTS);
            System.out.println("Nilai : "+ UAS);
            System.out.println("Nilai akhir : "+ Nilai_akhir);
        }
    }

}
