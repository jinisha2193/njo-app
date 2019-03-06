package njo.practice.app.njoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /*private List<User> users = new ArrayList<>(Arrays.asList(
            new User("1", "Alec", 1),
            new User("2", "Jinisha",1),
            new User("3", "Michael",0),
            new User("4", "Nick",0)
    ));*/

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addUser(User user) {
        userRepository.save(user);

    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
