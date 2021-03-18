package service;

import model.Animal;

public interface AnimalService {
    Animal createAnimal(Animal animal);
    Animal readAnimal(long id);
    Animal updateAnimal(long id, Animal animal);
    boolean deleteAnimal(long id);
}
