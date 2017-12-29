package my.test.app.services;

import my.test.app.model.Animal;
import org.springframework.stereotype.Service;
import my.test.app.repositories.AnimalRepository;
import my.test.app.Mapper;

@Service
public class AnimalRepositoryService {

    //AnimalDTO instead of Animal or not
    private AnimalRepository animalRepository;

    public AnimalRepositoryService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public void save(Animal animal) {
        animalRepository.save(Mapper.map(animal));
    }


}
