public class Karyawan {
    String nama;
    String departemen;
    char jeniskelamin;
    String NIP;
    String jabatan;
    Integer gaji;
    Integer target;
    Integer penjualan;
    Integer cuti;

    Karyawan(String nama, String departemen, char jeniskelamin){
        this.nama=nama;
        this.departemen=departemen;
        this.jeniskelamin=jeniskelamin;
        this.cuti=12;
    }
    void setGaji(Integer gaji){
        this.gaji=gaji;
    }
    void setCuti(Integer cuti){
        this.cuti+=cuti;
    }
    void setCuti(String cuti){
        if (cuti=="pernikahan"){
            this.cuti+=2;
        }else if(cuti=="persalinan"){
            if (jeniskelamin=='P'){
                this.cuti+=90;
            } else{
                this.cuti+=3;
            }
        }
    }
    void setNip(String NIP){
        this.NIP=NIP;
    }
    void setNip(Integer NIP){}
    void setTarget(Integer target){
        this.target=target;
    }
    void setPenjualan(Integer penjualan){
        this.penjualan=penjualan;
    }
    Integer getTHR(){
        return 0;
    }
    void displayInfo(){
        System.out.println("===================================");
        System.out.println("Jabatan : " + departemen);
        System.out.println("Nama : " + nama);
        System.out.println("NIP : "+NIP);
        System.out.println("Gaji : "+gaji);
        System.out.println("THR : "+getTHR());
        System.out.println("Cuti : "+cuti);
    }
}