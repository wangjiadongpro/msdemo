package hello.repository;

import hello.model.DrugSeed;
import org.springframework.data.repository.CrudRepository;

public interface DrugSeedRepository extends CrudRepository<DrugSeed, Integer> {
}

