package adnan.springboot_cassandra.web;

import adnan.springboot_cassandra.entities.User;
import adnan.springboot_cassandra.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

/**
 * @author Dell Latitude 5420
 * IFRAH ADNAN
 **/
@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping("/user")
    public List<User> findAll (){
        if (userService.getAllUsers().isEmpty()){
             return Collections.emptyList();

        }
        else {
            return userService.getAllUsers();
        }
    }
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {

       return userService.addUser(user);

    }
    @DeleteMapping("/user/{id}")
    public String DeleteUser(@PathVariable UUID id){
        return userService.DeleteUser(id);
    }
    @GetMapping("/user/{id}")
    public User findById(@PathVariable UUID id){
        return userService.findUserById(id);
    }
    @PutMapping("/user/{id}")
    public String UpdateUser(@PathVariable UUID id,@RequestBody User user){
        return userService.UpdateUser(id,user);

    }




}
