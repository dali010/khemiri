package Khemiri.Moetez.wellBeing.repository;

import Khemiri.Moetez.wellBeing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
