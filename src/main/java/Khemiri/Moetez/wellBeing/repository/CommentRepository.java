package Khemiri.Moetez.wellBeing.repository;

import Khemiri.Moetez.wellBeing.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
