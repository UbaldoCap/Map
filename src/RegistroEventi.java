import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class RegistroEventi {
    private Map<LocalDate, String> registromap;

    public RegistroEventi(HashMap<LocalDate, String> registromap) {
        this.registromap = registromap;
    }

    public Map<LocalDate, String> getRegistromap() {
        return registromap;
    }

    public void setRegistromap(Map<LocalDate, String> registromap) {
        this.registromap = registromap;
    }

    //TODO creare una classe evento con date durata e nome e poi un a classe cliente
    // si complica perchè non solo contrallata la data e
    // quindi se è lo stesso cliente gli diamo la possibilità di creare anche un appuntamnto alla stesso ora
    public void aggiungiEvento(LocalDate date, String evento) {
        if (registromap.containsKey(date)) {
            System.out.println("La data è già occupata");
        } else {
            registromap.put(date, evento);
            System.out.println("L'evento è stato aggiunto correttamente");
        }
    }

    public void rimuoviEvento(LocalDate date) {
        if (registromap.containsKey(date)) {
            registromap.remove(date);
            System.out.println("evento rimosso con successo");
        } else {
            System.out.println("La data non presenta eventi");
        }
    }

    public void visualizzaEvento(LocalDate date) {
        for (Map.Entry<LocalDate, String> entry : registromap.entrySet()) {
            if (entry.getKey().equals(date)) {
                System.out.println(entry);
            }
        }
    }
}
