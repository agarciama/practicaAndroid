package es.upsa.papps.cervantes;

public class Reservas {

    private String id;
    private String nombre;
    private int numeroDePersonas;
    private String fecha;
    private String hora;

    // Constructor con todos los campos necesarios
    public Reservas(String id, String nombre, int numeroDePersonas, String fecha, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.numeroDePersonas = numeroDePersonas;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y setters para cada campo
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(int numeroDePersonas) {
        this.numeroDePersonas = numeroDePersonas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
