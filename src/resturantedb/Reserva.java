package resturantedb;
import java.io.Serializable;
import javax.persistence.*;
import java.util.*;

@Entity
public class Reserva implements Serializable {
    
    @Id 
    int id;
    String cliente;
    Date fecha;
    int numeroComensales;

    public Reserva(int id, String cliente, Date fecha, int numeroComensales) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroComensales = numeroComensales;
    }
    
    public Reserva(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", fecha=" + fecha + ", numeroComensales=" + numeroComensales + '}';
    }
}
