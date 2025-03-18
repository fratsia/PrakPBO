package TempatParkir;

import java.util.ArrayList;

import Kendaraan.Kendaraan;

public class lantai5 extends TempatParkir {
    private static ArrayList<String> DaftarKendPerlantai= new ArrayList<>();

    @Override
    public void addKendaraan(Kendaraan Kendaraan) {
        super.addKendaraan(Kendaraan);
        DaftarKendPerlantai.add(Kendaraan.getNama());
    }


    public static ArrayList<String> getDaftarKendaraanPerlantai() {
        return DaftarKendPerlantai;
    }

    @Override
    public boolean isExistPerLantai (String namakendaraan) {
        return DaftarKendPerlantai.contains(namakendaraan);
    }

    @Override
    public Kendaraan removeKendaraan (String namaRemove) {
        DaftarKendPerlantai.remove(namaRemove);
        return super.removeKendaraan(namaRemove);
    }
}
