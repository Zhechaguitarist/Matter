package puhov.matter.com.Matter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import puhov.matter.com.Matter.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
