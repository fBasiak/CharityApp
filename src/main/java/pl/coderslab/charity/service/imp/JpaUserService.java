package pl.coderslab.charity.service.imp;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.model.User;
import pl.coderslab.charity.domain.repository.UserRepository;
import pl.coderslab.charity.service.UserService;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class JpaUserService implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public JpaUserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addUser(User userAdd) {
        String encodedPassword = passwordEncoder.encode(userAdd.getPassword());
       userAdd.setPassword(encodedPassword);
       userAdd.setRole("ROLE_USER");
       userRepository.save(userAdd);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
