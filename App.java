import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nik, nama, jenisKelamin, golongan;
        int gajiPokok, tunjangan, potongan, pelanggaran, jumlahPelanggaran, total;

        Scanner keyboard = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("NIK                   : ");
        nik = keyboard.nextLine();
        System.out.print("Nama                  : ");
        nama = keyboard.nextLine();
        System.out.print("Jenis Kelamin         : ");
        jenisKelamin = keyboard.nextLine();
        System.out.print("Golongan              : ");
        golongan = scan.nextLine();
        System.out.print("Jumlah Pelanggaran    : ");
        jumlahPelanggaran = scan.nextInt();

        switch (golongan) {
            case "1":
                gajiPokok = 1000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 1.txt");
                System.out.println("");

                FileWriter dataGaji1 = new FileWriter("Gaji Golongan 1.txt", true);

                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("-----------------------------------------------------");
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("-----------------------------------------------------");
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("NIK\t\t: " + nik);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Nama\t\t: " + nama);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Golongan\t\t: " + golongan);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Tunjangan\t\t: " + tunjangan);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Potongan\t\t: " + potongan);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("Total Gaji\t\t: " + total);
                dataGaji1.write(System.getProperty("line.separator"));
                dataGaji1.write("-----------------------------------------------------");
                dataGaji1.write(System.getProperty("line.separator"));

                dataGaji1.close();

                break;
            case "2":
                gajiPokok = 2000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 2.txt");
                System.out.println("");

                FileWriter dataGaji2 = new FileWriter("Gaji Golongan 2.txt", true);

                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("-----------------------------------------------------");
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("-----------------------------------------------------");
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("NIK\t\t: " + nik);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Nama\t\t: " + nama);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Golongan\t\t: " + golongan);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Tunjangan\t\t: " + tunjangan);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Potongan\t\t: " + potongan);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("Total Gaji\t\t: " + total);
                dataGaji2.write(System.getProperty("line.separator"));
                dataGaji2.write("-----------------------------------------------------");
                dataGaji2.write(System.getProperty("line.separator"));

                dataGaji2.close();

                break;
            case "3":
                gajiPokok = 3000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 3.txt");
                System.out.println("");

                FileWriter dataGaji3 = new FileWriter("Gaji Golongan 3.txt", true);

                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("-----------------------------------------------------");
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("-----------------------------------------------------");
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("NIK\t\t: " + nik);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Nama\t\t: " + nama);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Golongan\t\t: " + golongan);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Tunjangan\t\t: " + tunjangan);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Potongan\t\t: " + potongan);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("Total Gaji\t\t: " + total);
                dataGaji3.write(System.getProperty("line.separator"));
                dataGaji3.write("-----------------------------------------------------");
                dataGaji3.write(System.getProperty("line.separator"));

                dataGaji3.close();

                break;
            case "4":
                gajiPokok = 4000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 4.txt");
                System.out.println("");

                FileWriter dataGaji4 = new FileWriter("Gaji Golongan 4.txt", true);

                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("-----------------------------------------------------");
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("-----------------------------------------------------");
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("NIK\t\t: " + nik);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Nama\t\t: " + nama);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Golongan\t\t: " + golongan);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Tunjangan\t\t: " + tunjangan);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Potongan\t\t: " + potongan);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("Total Gaji\t\t: " + total);
                dataGaji4.write(System.getProperty("line.separator"));
                dataGaji4.write("-----------------------------------------------------");
                dataGaji4.write(System.getProperty("line.separator"));

                dataGaji4.close();

                break;
            case "5":
                gajiPokok = 5000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 5.txt");
                System.out.println("");

                FileWriter dataGaji5 = new FileWriter("Gaji Golongan 5.txt", true);

                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("-----------------------------------------------------");
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("-----------------------------------------------------");
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("NIK\t\t: " + nik);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Nama\t\t: " + nama);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Golongan\t\t: " + golongan);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Tunjangan\t\t: " + tunjangan);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Potongan\t\t: " + potongan);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("Total Gaji\t\t: " + total);
                dataGaji5.write(System.getProperty("line.separator"));
                dataGaji5.write("-----------------------------------------------------");
                dataGaji5.write(System.getProperty("line.separator"));

                dataGaji5.close();

                break;
            case "6":
                gajiPokok = 6000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 6.txt");
                System.out.println("");

                FileWriter dataGaji6 = new FileWriter("Gaji Golongan 6.txt", true);

                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("-----------------------------------------------------");
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("-----------------------------------------------------");
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("NIK\t\t: " + nik);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Nama\t\t: " + nama);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Golongan\t\t: " + golongan);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Tunjangan\t\t: " + tunjangan);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Potongan\t\t: " + potongan);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("Total Gaji\t\t: " + total);
                dataGaji6.write(System.getProperty("line.separator"));
                dataGaji6.write("-----------------------------------------------------");
                dataGaji6.write(System.getProperty("line.separator"));

                dataGaji6.close();

                break;
            case "7":
                gajiPokok = 7000000;
                tunjangan = (gajiPokok) * 10 / 100;
                pelanggaran = 25000;
                potongan = pelanggaran * jumlahPelanggaran;

                total = (gajiPokok + tunjangan) - potongan;

                System.out.println("");
                System.out.println("+----------------------------------------+");
                System.out.println("|      Gaji Karyawan PT. JabarIndo       |");
                System.out.println("+---------------------+------------------+");
                System.out.println("|NIK                  |" + nik);
                System.out.println("|Nama                 |" + nama);
                System.out.println("|Golongan             |" + golongan);
                System.out.println("|Gaji Pokok           |" + gajiPokok);
                System.out.println("|Tunjangan            |" + tunjangan);
                System.out.println("|Potongan             |" + potongan);
                System.out.println("|Total Gaji           |" + total);
                System.out.println("+---------------------+------------------+");
                System.out.println("Data tersimpan di file Gaji Golongan 7.txt");
                System.out.println("");

                FileWriter dataGaji7 = new FileWriter("Gaji Golongan 7.txt", true);

                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("-----------------------------------------------------");
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("\tGaji Karyawan PT. JabarIndo");
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("-----------------------------------------------------");
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("NIK\t\t: " + nik);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Nama\t\t: " + nama);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Golongan\t\t: " + golongan);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Gaji Pokok\t\t: " + gajiPokok);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Tunjangan\t\t: " + tunjangan);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Potongan\t\t: " + potongan);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("Total Gaji\t\t: " + total);
                dataGaji7.write(System.getProperty("line.separator"));
                dataGaji7.write("-----------------------------------------------------");
                dataGaji7.write(System.getProperty("line.separator"));

                dataGaji7.close();

                break;
        }
    }
}