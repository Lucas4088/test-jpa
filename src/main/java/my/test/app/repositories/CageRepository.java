package my.test.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import my.test.app.persistentObjects.CageEntity;

public interface CageRepository extends JpaRepository<CageEntity, Integer> {
}
