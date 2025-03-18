package Kendaraan;

public class Kendaraan {
    private String nama;
    private String jenis;
    private int Roda;
    public Kendaraan (String nama, String jenis) {
        this.nama=nama;
        this.jenis=jenis;
        if (jenis=="Motor") {
            this.Roda=2;
        } else if (jenis=="Sepeda") {
            this.Roda=2;
        } else if (jenis=="Mobil"){
            this.Roda=4;
        }
    }
    public String getNama() {
        return nama;
    }
    public int getRoda(){
        return Roda;
    }
    public String getJenis() {
        return jenis;
    }
    public int getHarga(int jam) {
        return 0;
    }
}