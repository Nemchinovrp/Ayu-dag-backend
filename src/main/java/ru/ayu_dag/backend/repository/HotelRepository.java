package ru.ayu_dag.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ayu_dag.backend.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
