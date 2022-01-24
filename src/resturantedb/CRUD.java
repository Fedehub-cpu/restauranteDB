package resturantedb;
import javax.persistence.*;
import java.util.*;

public class CRUD {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/restaurantedb.odb");
    EntityManager em = emf.createEntityManager();
    

    public void saveCliente(Cliente c){
   
        EntityManager em = emf.createEntityManager();        
        em.getTransaction().begin();        
        em.persist(c);       
        em.getTransaction().commit();       
        em.close();
        System.out.println("Método saveCliente implementado");
    
    }
    
    public void saveReserva(Reserva r){
    
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();        
        em.persist(r);
        em.getTransaction().commit();
        em.close();
        System.out.println("Método saveReserva implementado");

    }
    
public void deleteCliente(int id){
    
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Query q3 = em.createQuery("DELETE FROM Cliente c WHERE c.id= :id");
    q3.setParameter("id", id);
    int updateCount = q3.executeUpdate();
    em.getTransaction().commit();
    em.close();
    
    System.out.println("Método deleteCliente implementado");
    
    }

public void deleteReserva(int id){
    
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Query q3 = em.createQuery("DELETE FROM Reserva r WHERE r.id= :id");
    q3.setParameter("id", id);
    int updateCount = q3.executeUpdate();
    em.getTransaction().commit();
    em.close();
    System.out.println("Método deleteReserva implementado");
    }
       
 public void updateCliente(int id, String nombre){
    
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    String queryString = ("UPDATE Cliente c SET c.nombre= :nombre WHERE c.id= :id");
    Query query=em.createQuery(queryString);
    query.setParameter("nombre", nombre);
    query.setParameter("id", id);
    int result = query.executeUpdate();
    em.getTransaction().commit();
    em.close();
    System.out.println("Método updateCliente implementado");
     
  } 
 
  public void updateReserva(int id, String cliente){
      
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    String queryString = ("UPDATE Reserva r SET r.cliente= :cliente WHERE r.id=:id");
    Query query=em.createQuery(queryString);
    query.setParameter("cliente", cliente);
    query.setParameter("id", id);
    int result = query.executeUpdate();
    em.getTransaction().commit();
    em.close();
    System.out.println("Método updateReserva implementado");
     
  } 
  
  public void leerClientes(){
      
  EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
  Query q1 = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
  List <Cliente> results = q1.getResultList();
       for(Cliente a : results){
       System.out.println( "[" + a.getId() + "]" + " " +a.getNombre() + " " + a.getApellidos() + " " + a.getTelefono());
  }
    em.getTransaction().commit();
    em.close();
    System.out.println("Método leerClientes implementado");
 }
  
   public void leerReservas(){
      
  EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
  Query q1 = em.createQuery("SELECT r FROM Reserva r");
  List <Reserva> results = q1.getResultList();
       for(Reserva r : results){
       System.out.println(r);
  }
    em.getTransaction().commit();
    em.close();
    System.out.println("Método leerReservas implementado");
 }
}
