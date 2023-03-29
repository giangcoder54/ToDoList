package hanu.codewithgiang.crud_backend.repository;

import hanu.codewithgiang.crud_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
}
