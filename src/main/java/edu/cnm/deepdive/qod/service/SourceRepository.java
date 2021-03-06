package edu.cnm.deepdive.qod.service;

import edu.cnm.deepdive.qod.model.entity.Quote;
import edu.cnm.deepdive.qod.model.entity.Source;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, UUID> {

  Iterable<Source> findAllByOrderByName();

  Iterable<Source> getAllByNameContainsOrderByNameAsc(String fragment);

  default Source findOrFail(UUID id) {
    return findById(id).get();
  }

}
