package be.beers;

import be.beers.model.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {


    public static void main(String[] args) {

        //entities maken
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasourceLocal");

       //entities mangagen
        EntityManager em = emf.createEntityManager();


        Message message =new Message();
        em.getTransaction();
        em.persist(message);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
