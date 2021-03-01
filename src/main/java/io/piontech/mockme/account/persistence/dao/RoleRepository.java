package io.piontech.mockme.account.persistence.dao;

import io.piontech.mockme.account.persistence.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
