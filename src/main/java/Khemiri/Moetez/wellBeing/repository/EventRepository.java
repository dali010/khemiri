package Khemiri.Moetez.wellBeing.repository;

import Khemiri.Moetez.wellBeing.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByNameEquals(String name);
}
