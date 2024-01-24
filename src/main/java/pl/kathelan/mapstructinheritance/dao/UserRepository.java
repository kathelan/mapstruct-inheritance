package pl.kathelan.mapstructinheritance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kathelan.mapstructinheritance.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
