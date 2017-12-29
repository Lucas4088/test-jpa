package my.test.app;

import my.test.app.model.Animal;
import my.test.app.model.Cage;
import my.test.app.model.Shelter;
import my.test.app.persistentObjects.AnimalEntity;
import my.test.app.persistentObjects.CageEntity;
import my.test.app.persistentObjects.ShelterEntity;

public class Mapper {

    public static Shelter map(ShelterEntity shelterEntity) {
        return new Shelter(
                shelterEntity.getId(),
                shelterEntity.getName(),
                shelterEntity.getAddress()
        );
    }

    public static ShelterEntity map(Shelter shelter) {
        return new ShelterEntity(
                shelter.getName(),
                shelter.getAddress()
        );
    }

    public static Animal map(AnimalEntity animalEntity) {
        return new Animal(
                animalEntity.getId(),
                animalEntity.getName(),
                animalEntity.getSpecies()
        );
    }

    public static AnimalEntity map(Animal animal) {
        return new AnimalEntity(
                animal.getName(),
                animal.getSpecies()
        );
    }

    public static Cage map(CageEntity cageEntity) {
        return new Cage(
                cageEntity.getId(),
                cageEntity.getCapacity(),
                cageEntity.isOccupied()
        );
    }

    public static CageEntity map(Cage cage) {
        return new CageEntity(
                cage.getCapacity(),
                cage.isOccupied()
        );
    }
}
