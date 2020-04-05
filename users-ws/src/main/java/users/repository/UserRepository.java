package users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity ,Long> {
    UserEntity findAllByEmail(String email);
}
