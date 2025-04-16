import java.util.ArrayList;

public class Workshop {
    String title;
    String date;
    String speaker;
    int capacity;
    String bonus;
    String tipe;
    String pesan;
    ArrayList<String> peserta;
    ArrayList<Participant> participantArrayList;
    Participant sementara;

    Workshop(String title, String date, String speaker, int capacity, String bonus, String tipe, String pesan) {
        this.title = title;
        this.date = date;
        this.speaker = speaker;
        this.capacity = capacity;
        this.tipe = tipe;
        this.bonus = bonus;
        this.pesan = pesan;
        this.peserta = new ArrayList<>();
        this.participantArrayList = new ArrayList<>();
    }
    boolean register(String email,Participant participant){
        if (this.capacity==0){
            return false;
        }
        for (String mail : peserta)
            if (email==mail){
                return false;
            }
        this.peserta.add(email);
        this.participantArrayList.add(participant);
        this.capacity-=1;
        return true;
    }
    boolean cancel(String email){
        for (Participant par : participantArrayList)
            if (par.email==email){
                this.peserta.remove(email);
                this.capacity+=1;
                this.sementara=par;
                this.participantArrayList.remove(par);
                return true;
            }
        return false;
    }
}
