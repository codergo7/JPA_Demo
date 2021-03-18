package service;

import data.dao.AnimalDAO;
import data.dao.AnimalDAOImpl;
import model.Animal;

public class AnimalServiceImpl implements AnimalService{

    private AnimalDAO animalDAO = new AnimalDAOImpl();


    @Override
    public Animal createAnimal(Animal animal) {
        return animalDAO.createAnimal(animal);
    }

    @Override
    public Animal readAnimal(long id) {
        return animalDAO.readAnimal(id);
    }

    @Override
    public Animal updateAnimal(long id, Animal animal) {
        return animalDAO.updateAnimal(id, animal);
    }

    @Override
    public boolean deleteAnimal(long id) {
        return animalDAO.deleteAnimal(id);
    }
}
