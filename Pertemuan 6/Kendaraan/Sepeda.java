package Kendaraan;

public class Sepeda extends Kendaraan{
    public Sepeda(String nama){
        super(nama, "Sepeda");
    }
    @Override
    public int getHarga(int jam) {
        int harga=0;
        if (jam >= 1) {
        harga+=2000;
        jam--;
        }
        if (jam >= 1) {
        harga+=1000;
        jam--;
        }
        harga+=500*jam;
        return harga;
    }
}
