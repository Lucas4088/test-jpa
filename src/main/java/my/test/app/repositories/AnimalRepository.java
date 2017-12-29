package my.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import my.test.app.persistentObjects.AnimalEntity;
import org.springframework.stereotype.Service;

@Service
public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {
}
