import java.util.Scanner;
import java.util.ArrayList;

import TempatParkir.lantai1;
import TempatParkir.lantai2;
import TempatParkir.lantai3;
import TempatParkir.lantai4;
import TempatParkir.lantai5;
import TempatParkir.TempatParkir;
import Kendaraan.Kendaraan;
import Kendaraan.Mobil;
import Kendaraan.Motor;
import Kendaraan.Sepeda;

public class Main {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        lantai1 lantai1 = new lantai1();
        lantai2 lantai2 = new lantai2();
        lantai3 lantai3 = new lantai3();
        lantai4 lantai4 = new lantai4();
        lantai5 lantai5 = new lantai5();
        ArrayList<TempatParkir> tempatParkir = new ArrayList<TempatParkir>();
        tempatParkir.add(lantai1);
        tempatParkir.add(lantai2);
        tempatParkir.add(lantai3);
        tempatParkir.add(lantai4);
        tempatParkir.add(lantai5);

        while (true) {
            System.out.println("\nMain menu \n1. Tampilkan daftar parkiran \n2. Tambahkan Kendaraan \n3. Pindahkan Kendaraan \n4. Kendaraan Keluar \n5. End");
            System.out.println("Pilih Opsi: ");

            Scanner scan = new Scanner(System.in);
            int pilihan = scan.nextInt();

            if (pilihan==1) {
                int lantai = 1;
                for (TempatParkir tempatparkir : tempatParkir) {
                    System.out.println("\nLantai " + lantai);
                    tempatparkir.getAllKendaraan();
                    lantai++;
                }

            } else if (pilihan==2) {
                String nama = null;
                while (true) {
                    System.out.println("\nMasukkan nama kendaraan: ");
                    Scanner scannama = new Scanner(System.in);
                    nama = scannama.nextLine();
                    if (TempatParkir.isExist(nama)) {
                        System.out.println("---Nama sudah diambil---");
                    } else {
                        break;
                    }
                }
                int jenis = 0;
                while (true) {
                    System.out.println("\n1. Mobil \n2. Motor \n3. Sepeda");
                    System.out.println("Pilih Opsi Kendaraan: ");
                    Scanner scanjenis = new Scanner(System.in);
                    jenis = scanjenis.nextInt();

                    if (1<=jenis && jenis<=3) {
                        break;
                    } else {
                        System.out.println("---Pilih Opsi Kendaraan yang benar---");
                    }
                }
                Kendaraan kendaraanbaru = null;
                if (jenis==1) {
                    kendaraanbaru = new Mobil(nama);
                } else if (jenis==2) {
                    kendaraanbaru = new Motor(nama);
                } else if (jenis==3) {
                    kendaraanbaru = new Sepeda(nama);
                }

                while (true) {
                    int nomerlantai=0;
                    while (true) {
                        System.out.println("\nLantai Parkir \n1. Lantai 1 \n2. Lantai 2 \n3. Lantai 3 \n4. Lantai 4 \n5. Lantai 5");
                        System.out.println("Pilih Lantai Parkir: ");
                        Scanner scanlantai = new Scanner(System.in);
                        nomerlantai = scanlantai.nextInt();
                        if (1<=nomerlantai && nomerlantai<=5) {
                            break;
                        } else {
                            System.out.println("---Pilih Lantai Parkir yang benar---");
                        }
                    }
                    if (tempatParkir.get(nomerlantai-1).isFull(kendaraanbaru.getRoda())){
                        System.out.println("Lantai sudah penuh pilih tempat lain");
                    } else {
                        tempatParkir.get(nomerlantai-1).addKendaraan(kendaraanbaru);
                        break;
                    }
                }

            } else if (pilihan==3) {
                int nomerlantai = 0; 
                while (true) {
                    System.out.println("\nLantai Parkir \n1. Lantai 1 \n2. Lantai 2 \n3. Lantai 3 \n4. Lantai 4 \n5. Lantai 5");
                    System.out.println("Pilih Lantai Parkir: ");
                    Scanner scanlantai = new Scanner(System.in);

                    nomerlantai = scanlantai.nextInt();
                    if (1<=nomerlantai && nomerlantai<=5) {
                        break;
                    } else {
                        System.out.println("---Pilih Lantai Parkir yang benar---");
                    }
                }
                String namakendaraanremove = null;
                while (true) {
                    System.out.println("\nMasukkan nama yang ingin dipindah: ");
                    Scanner scannama = new Scanner(System.in);
                    namakendaraanremove = scannama.nextLine();
                    if ((tempatParkir.get(nomerlantai-1)).isExistPerLantai(namakendaraanremove)) {
                        break;
                    } else {
                        System.out.println("---Nama tidak ditemukan---");
                    }
                }
                Kendaraan kendaraanPindah= tempatParkir.get(nomerlantai-1).removeKendaraan(namakendaraanremove);
                while (true) {
                    int nomerlantaibaru=0;
                    while (true) {
                        System.out.println("\nLantai Parkir \n1. Lantai 1 \n2. Lantai 2 \n3. Lantai 3 \n4. Lantai 4 \n5. Lantai 5");
                        System.out.println("Pilih Lantai Parkir: ");
                        Scanner scanlantai = new Scanner(System.in);
                        nomerlantai = scanlantai.nextInt();
                        if (1<=nomerlantai && nomerlantai<=5) {
                            break;
                        } else {
                            System.out.println("---Pilih Lantai Parkir yang benar---");
                        }
                    }
                    if (tempatParkir.get(nomerlantai-1).isFull(kendaraanPindah.getRoda())){
                        System.out.println("Lantai sudah penuh pilih tempat lain");
                    } else {
                        tempatParkir.get(nomerlantai-1).addKendaraan(kendaraanPindah);
                        break;
                    }
                }
            } else if (pilihan==4) {
                int nomerlantai = 0; 
                while (true) {
                    System.out.println("\nLantai Parkir \n1. Lantai 1 \n2. Lantai 2 \n3. Lantai 3 \n4. Lantai 4 \n5. Lantai 5");
                    System.out.println("Pilih Lantai Parkir: ");
                    Scanner scanlantai = new Scanner(System.in);

                    nomerlantai = scanlantai.nextInt();
                    if (1<=nomerlantai && nomerlantai<=5) {
                        break;
                    } else {
                        System.out.println("---Pilih Lantai Parkir yang benar---");
                    }
                }
                String namakendaraanremove = null;
                while (true) {
                    System.out.println("\nMasukkan nama yang ingin keluar: ");
                    Scanner scannama = new Scanner(System.in);
                    namakendaraanremove = scannama.nextLine();
                    if ((tempatParkir.get(nomerlantai-1)).isExistPerLantai(namakendaraanremove)) {
                        break;
                    } else {
                        System.out.println("---Nama tidak ditemukan---");
                    }
                }
                Kendaraan kendaraanKeluar=tempatParkir.get(nomerlantai-1).removeKendaraan(namakendaraanremove);
                int jam = 0;
                while (true) {
                    System.out.println("\nMasukkan Waktu lama parkir: ");
                    Scanner jamScanner = new Scanner(System.in);
                    jam = jamScanner.nextInt();
                    if (jam >= 0) {
                        break;
                    }
                }
                System.out.println("Bayar Rp. " + kendaraanKeluar.getHarga(jam));

            } else if (pilihan==5) {
                System.out.println("Selesai");
                break;
            }
        }
    }
}