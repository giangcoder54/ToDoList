package hanu.codewithgiang.crud_backend.controller;

import hanu.codewithgiang.crud_backend.model.User;
import hanu.codewithgiang.crud_backend.repository.UserRepository;
import hanu.codewithgiang.crud_backend.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @PostMapping("/user")
    ResponseEntity<User> newUser(@RequestBody User newUser){
        User user = userService.createUser(newUser);
        return new ResponseEntity<>(user,HttpStatus.CREATED);
    }
    @GetMapping("/users")
    List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") int id){
        User user = userService.getById(id);
        return ResponseEntity.ok().body(user);
    }
    @PutMapping("/update/{id}")
    ResponseEntity<User> editUser(@PathVariable("id") int  id,@RequestBody User userDetail)  {
          User updatedUser =  userService.updateUser(id, userDetail);
            return new ResponseEntity<>(updatedUser, HttpStatus.OK);


}
    @DeleteMapping("/delete/{id}")
    String deleteUserById(@PathVariable("id") int id){
       userService.deleteUserById(id);
       return "User with id "+ id+" has been removed";
    }
}
