import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        RegistroEventi eventi = new RegistroEventi(new HashMap<>());
        eventi.aggiungiEvento(LocalDate.of(2023, 12, 25), "Natale");
        eventi.aggiungiEvento(LocalDate.of(2023, 12, 25), "Natale 2");
        eventi.aggiungiEvento(LocalDate.of(2023, 12, 24), " Vigilia natale");
        eventi.rimuoviEvento(LocalDate.of(2023, 12, 25));
        eventi.visualizzaEvento(LocalDate.of(2023, 12, 24));
    }
}
