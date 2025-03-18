package TempatParkir;

import java.util.ArrayList;
import Kendaraan.Kendaraan;

public class TempatParkir {
    private static ArrayList<String> namakendaraan = new ArrayList<>();
    private int roda=0;
    private int maxroda=12;
    private ArrayList<Kendaraan> daftarKendaraan = new ArrayList<Kendaraan>();

    public void addKendaraan(Kendaraan Kendaraan) {
        this.roda += Kendaraan.getRoda();
        namakendaraan.add(Kendaraan.getNama());
        daftarKendaraan.add(Kendaraan);
    }

    public int getRoda() {
        return roda;
    }

    public int getMaxRoda() {
        return maxroda;
    }

    public int getSisaTempat(){
        return maxroda - roda;
    }

    public boolean isFull(int tambahroda) {
        return roda+tambahroda>maxroda;
    }

    public void getAllKendaraan() {
        int no=1;
        for (Kendaraan kendaraan : daftarKendaraan){
            System.out.println(no + ". " + kendaraan.getNama() + "--" +kendaraan.getJenis());
            no++;
        }
        System.out.println("Jumlah tempat yang terpakai: " + roda + " Sisa tempat: " + getSisaTempat());
    }

    public Kendaraan removeKendaraan(String namakendaraan) {
        Kendaraan removed = null;
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan.getNama().equals(namakendaraan)) {
                roda-=kendaraan.getRoda();
                daftarKendaraan.remove(kendaraan);
                removed = kendaraan;
                break;
            }
        }
        return removed;
    }

    public ArrayList<String> getAllNamaKendaraan() {
        return namakendaraan;
    }

    public static boolean isExist(String nama) {
        return namakendaraan.contains(nama);
    }

    public boolean isExistPerLantai (String namakendaraan) {
        return false;
    }
}
