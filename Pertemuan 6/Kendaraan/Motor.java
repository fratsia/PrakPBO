package Kendaraan;

public class Motor extends Kendaraan {
    public Motor(String nama) {
        super(nama, "Motor");
    }
    @Override
    public int getHarga(int jam) {
        int harga=0;
        if (jam >= 1) {
        harga+=3000;
        jam--;
        }
        if (jam >= 1) {
        harga+=2000;
        jam--;
        }
        harga+=1000*jam;
        return harga;
    }
}
