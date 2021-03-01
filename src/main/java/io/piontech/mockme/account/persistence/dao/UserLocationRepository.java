package io.piontech.mockme.account.persistence.dao;

import io.piontech.mockme.account.persistence.domain.User;
import io.piontech.mockme.account.persistence.domain.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
