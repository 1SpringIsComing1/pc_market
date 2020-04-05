package users.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import users.shared.UserDto;

public interface UserService  extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserDetailsByEmail(String email);


}
