package data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Demo");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
