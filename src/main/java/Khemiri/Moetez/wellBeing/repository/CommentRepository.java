package Khemiri.Moetez.wellBeing.repository;

import Khemiri.Moetez.wellBeing.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByEvent_EventId(Long eventId);
}
