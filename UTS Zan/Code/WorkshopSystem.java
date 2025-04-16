import java.util.ArrayList;

public class WorkshopSystem {
    ArrayList<Workshop> dataworkshop;
    WorkshopSystem(){
        dataworkshop=new ArrayList<>();
    }
    void addWorkshop(Workshop workshop){
        dataworkshop.add(workshop);
    }

    void displayAvailableWorkshops(){
        System.out.println("BERIKUT DAFTAR WORKSHOP YANG TERSEDIA SAAT INI");
        for(Workshop workshop : dataworkshop){
            if (workshop.capacity!=0){
                System.out.println("["+workshop.tipe+"] "+workshop.title+" | Tanggal: "+workshop.date+" | Pemateri: "+workshop.speaker+" | kapasitas: "+workshop.capacity+" | Bonus: "+ workshop.bonus);
            }
        }
    }
    void register(Participant participant, Workshop workshop){
        boolean b = workshop.register(participant.email,participant) == false;
        if(b){
            System.out.println("Pendaftaran gagal: Kapasitas penuh untuk workshop "+workshop.title);
        } else{
            System.out.println(participant.nama+" Berhasil didaftrakan ke workshop "+workshop.title);
            System.out.println("Pesan '"+workshop.pesan+"' berhasil di kirim ke email pendaftar");
            System.out.println();
        };
    }

    void cancelRegistration(String email, Workshop workshop){
        boolean b = workshop.cancel(email)==false;
        if(b){
            System.out.println("Tidak ditemukan pendaftaran dengan email "+email+" pada workshop "+workshop.title);
        } else{
            System.out.println("pendaftaran di batalkan: Peserta: "+workshop.sementara.nama+" | ("+workshop.sementara.email+") | Workshop: "+workshop.title+" | ["+workshop.tipe+"] | Tanggal: "+workshop.date+" | Pemateri: "+workshop.speaker);
        }
    }
}
