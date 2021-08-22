package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.model.User;
import pl.coderslab.charity.domain.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public interface UserService {
  void addUser(User userAdd);
  List<User> findAll();
}
