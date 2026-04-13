package springweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springweb.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
