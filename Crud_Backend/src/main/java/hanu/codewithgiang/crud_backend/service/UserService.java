package hanu.codewithgiang.crud_backend.service;

import hanu.codewithgiang.crud_backend.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    User updateUser(int id, User userDetail);

     void deleteUserById(int id  );

    User createUser(User user);

    User getById(int id);
}
