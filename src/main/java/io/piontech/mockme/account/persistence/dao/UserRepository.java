package io.piontech.mockme.account.persistence.dao;

import io.piontech.mockme.account.persistence.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
