package my.test.app;

import my.test.app.model.Animal;
import my.test.app.services.AnimalRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "my.test.app")
public class App implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */


    @Autowired
    AnimalRepositoryService animalRepositoryService;


    /*@PostConstruct
    public void getAnimalRepository(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }*/
    @Override
    public void run(String... args) throws Exception {

        //AnimalRepositoryService animalRepositoryService = new AnimalRepositoryService(animalRepository);
        animalRepositoryService.save(new Animal(1, "Benek", "dog"));
    }

}
