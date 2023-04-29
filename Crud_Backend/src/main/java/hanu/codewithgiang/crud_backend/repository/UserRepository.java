package hanu.codewithgiang.crud_backend.repository;

import hanu.codewithgiang.crud_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
}
