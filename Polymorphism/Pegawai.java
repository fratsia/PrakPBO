public class Pegawai extends Karyawan {
    Pegawai(String nama, String departemen, char jeniskelamin) {
        super(nama, departemen, jeniskelamin);
    }
    void setNip(String NIP){
        if (NIP.charAt(0)=='P'){
            super.setNip(NIP);
        } else{
            super.setNip("Nip salah");
        }
    }
    @Override
    void setNip(Integer NIP) {
        super.setNip(String.format("P%04d",NIP));
    }
    @Override
    Integer getTHR(){
        return this.gaji;
    }
}