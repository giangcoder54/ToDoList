package hanu.codewithgiang.crud_backend.service;

import hanu.codewithgiang.crud_backend.model.User;
import hanu.codewithgiang.crud_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int id, User userDetail) {


        User   updateUser = userRepository.getById(id);

            if (updateUser != null  ){
                updateUser.setName(userDetail.getName());
                updateUser.setUsername(userDetail.getUsername());
                updateUser.setEmail(userDetail.getEmail());
                return userRepository.save(updateUser);
            }
            else {
                return null;
            }



    }


    @Override
    public void deleteUserById(int id) {
            userRepository.deleteById(id);

    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(int id) {
        Optional<User> user = userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }else{
            return null ;
        }
    }

    private class NotFoundException extends Exception {
        private String message;

        public NotFoundException(String message) {
            super(message);
        }
    }
}
