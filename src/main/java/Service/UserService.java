package Service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user;

import Repository.UserRepository;
import jakarta.transaction.Transactional;
@Service
public class UserService {

	

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public user getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    @Transactional
    public user saveUser(user user) {
        return userRepository.save(user);
    };
 

	
}
