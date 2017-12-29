package my.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import my.test.app.persistentObjects.ShelterEntity;

public interface ShelterRepository extends JpaRepository<ShelterEntity, Integer> {
}
