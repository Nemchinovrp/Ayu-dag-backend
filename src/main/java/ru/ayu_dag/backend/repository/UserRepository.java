package ru.ayu_dag.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ayu_dag.backend.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //findBy + fieldName
    Optional<User> findByUsername(String username);
}
