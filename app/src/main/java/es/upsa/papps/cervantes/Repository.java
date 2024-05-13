package es.upsa.papps.cervantes;

import java.util.List;


public interface Repository {
    List<Reservas> buscarTodasReservas();
    Reservas buscarReservaId(String id);
    void agregarReserva(Reservas reserva);
    void actualizarReserva(String id);
    void eliminarReserva(String id);



}
