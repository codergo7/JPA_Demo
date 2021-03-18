package data.dao;

import model.Animal;

public interface AnimalDAO {
    Animal createAnimal(Animal animal);
    Animal readAnimal(long id);
    Animal updateAnimal(long id, Animal animal);
    boolean decomposeAnimal(long id);
}
