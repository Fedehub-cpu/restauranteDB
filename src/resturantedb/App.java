package resturantedb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.persistence.*;
import java.util.*;

public class App {
    
    public static void main(String[] args) throws ParseException {
        
       //Conectar base de datos
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/restaurantedb.odb");
       EntityManager em = emf.createEntityManager();
    
     CRUD crud = new CRUD();
     /*
     Cliente cliente = new Cliente();
          cliente.setId(13);
       cliente.setNombre("Manuel");
       cliente.setApellidos("Abasolo Rodriguez");
       cliente.setTelefono("644556678");
       crud.saveCliente(cliente);
       
       //Actualiza el cliente 
       crud.updateCliente(1, "Dani");
       
       //Actualiza la reserva
       crud.updateReserva(1, "Dani"); 
        
       //Leer clientes
       crud.leerClientes();
       
       //Leer reservas
       crud.leerReservas();
       
       /*
       //Eliminar cliente
       crud.deleteCliente(1);
       
       //Eliminar reserva
       crud.deleteReserva(1);
       */
       
     
     //Leer clientes
       crud.leerClientes();
    }    
    
    
    
  }
    

