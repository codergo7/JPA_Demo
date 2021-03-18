package data.app;

import data.dao.AnimalDAO;
import data.dao.AnimalDAOImpl;
import model.Animal;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Beer", 200, 10);

        AnimalDAO animalDAO = new AnimalDAOImpl();

        Animal animalFromDB = animalDAO.readAnimal(3);

        //animalDAO.createAnimal(animal);

        //animal.setAge(30);
        //animalDAO.updateAnimal(animal.getId(), animal);

        animalDAO.decomposeAnimal(3);

    }
}
