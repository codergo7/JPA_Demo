package data.dao;

import data.EntityManagerProvider;
import model.Animal;

import javax.persistence.EntityManager;

public class AnimalDAOImpl implements AnimalDAO{

    @Override
    public Animal createAnimal(Animal animal) {

        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(animal);
        entityManager.getTransaction().commit();

        entityManager.close();

        return animal;
    }

    @Override
    public Animal readAnimal(long id) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);
        entityManager.getTransaction().commit();

        entityManager.close();
        return animal;
    }

    @Override
    public Animal updateAnimal(long id, Animal animal) {

        if(animal == null){
            return null;
        }
        EntityManager entityManager = EntityManagerProvider.getEntityManager();

        entityManager.getTransaction().begin();

        entityManager.merge(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
        return animal;
    }

    @Override
    public boolean decomposeAnimal(long id) {
        EntityManager entityManager = EntityManagerProvider.getEntityManager();
        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);

        if(animal == null){
            entityManager.getTransaction().rollback();
            entityManager.close();
            return false;
        }

        entityManager.remove(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
