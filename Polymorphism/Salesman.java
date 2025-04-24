public class Salesman extends Karyawan{
    Salesman(String nama, String departemen, char jeniskelamin) {
        super(nama, departemen, jeniskelamin);
    }
    void setNip(String NIP){
        if (NIP.charAt(0)=='S'){
            super.setNip(NIP);
        } else{
            super.setNip("Nip salah");
        }
    }
    @Override
    void setNip(Integer NIP) {
        setNip(String.format("S%04d",NIP));
    }
    @Override
    Integer getTHR(){
        if (penjualan>=target){
            return this.gaji*2;
        } else{
            return this.gaji;
        }
    }
}