package Kendaraan;

public class Mobil extends Kendaraan {
    public Mobil(String nama) {
        super(nama, "Mobil");
    }
    @Override
    public int getHarga(int jam) {
        int harga=0;
        if (jam >= 1) {
        harga+=5000;
        jam--;
        }
        if (jam >= 1) {
        harga+=3000;
        jam--;
        }
        harga+=2000*jam;
        return harga;
    }
}
