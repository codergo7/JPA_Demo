package app;

import data.dao.AnimalDAO;
import data.dao.AnimalDAOImpl;
import model.Animal;
import service.AnimalService;
import service.AnimalServiceImpl;

public class AnimalApp {

    public static void main(String[] args) {
        Animal animal = new Animal("Beer", 200, 10);

        AnimalService animalService = new AnimalServiceImpl();

        Animal animalFromDB = animalService.readAnimal(3);

        //animalDAO.createAnimal(animal);

        //animal.setAge(30);
        //animalDAO.updateAnimal(animal.getId(), animal);

        animalService.deleteAnimal(2);

    }
}
