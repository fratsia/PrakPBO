public class Manager extends Karyawan{

    Manager(String nama, String departemen, char jeniskelamin) {
        super(nama, departemen, jeniskelamin);
    }
    void setNip(String NIP){
        if (NIP.charAt(0)=='M'){
            super.setNip(NIP);
        } else{
            super.setNip("Nip salah");
        }
    }
    @Override
    void setNip(Integer NIP) {
        setNip(String.format("M%04d",NIP));
    }
    @Override
    Integer getTHR(){
        return this.gaji*2;
    }
}