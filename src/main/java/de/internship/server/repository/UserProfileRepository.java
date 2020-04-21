package de.internship.server.repository;

import de.internship.server.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "userprofile", path = "userprofile")
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
    List<UserProfile> findAll();

}
