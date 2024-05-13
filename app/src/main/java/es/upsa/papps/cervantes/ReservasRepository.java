package es.upsa.papps.cervantes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReservasRepository implements Repository{

    Map<String, Reservas> reservas = new HashMap<>();

    public ReservasRepository() {
        reservas.put("1", new Reservas("1", "Luis", 3, "2024-05-20", "20:00"));
        reservas.put("2", new Reservas("2","Ana", 2, "2024-05-21", "19:00"));
        reservas.put("3", new Reservas("3","Carlos", 5, "2024-05-22", "21:30"));
        reservas.put("4", new Reservas("4","Martina", 4, "2024-05-23", "18:00"));
        reservas.put("5", new Reservas("5","Jose", 2, "2024-05-24", "20:30"));
        reservas.put("6", new Reservas("6","Isabel", 3, "2024-05-25", "19:45"));
        reservas.put("7", new Reservas("7","Fernando", 6, "2024-05-26", "21:15"));
        reservas.put("8", new Reservas( "8","Elena", 2, "2024-05-27", "18:00"));
        reservas.put("9", new Reservas("9","Pablo", 5, "2024-05-28", "20:00"));
        reservas.put("10", new Reservas("10","Laura", 3, "2024-05-29", "19:00"));
        reservas.put("11", new Reservas("11","Sergio", 4, "2024-05-30", "21:30"));
        reservas.put("12", new Reservas("12","Carmen", 2, "2024-05-31", "18:00"));
        reservas.put("13", new Reservas("13","Lucas", 3, "2024-06-01", "20:30"));
        reservas.put("14", new Reservas("14","Marta", 6, "2024-06-02", "19:45"));
        reservas.put("15", new Reservas( "15","David", 2, "2024-06-03", "21:15"));
    }


    @Override
    public List<Reservas> buscarTodasReservas() {
        return List.copyOf(reservas.values());
    }

    @Override
    public Reservas buscarReservaId(String id) {
        return reservas.get(id);
    }

    @Override
    public void agregarReserva(Reservas reserva) {
        reservas.put(reserva.getId(), reserva);
    }

    @Override
    public void actualizarReserva(String id) {
        Reservas reserva = buscarReservaId(id);
        reservas.put(reserva.getId(), reserva);
    }

    @Override
    public void eliminarReserva(String id) {
        reservas.remove(id);
    }


}
