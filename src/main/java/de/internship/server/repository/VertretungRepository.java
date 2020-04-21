package de.internship.server.repository;

import de.internship.server.model.UserProfile;
import de.internship.server.model.Vertretung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "vertretung", path = "vertretung")
public interface VertretungRepository extends JpaRepository<Vertretung, String> {
    List<Vertretung> findAll();
}
