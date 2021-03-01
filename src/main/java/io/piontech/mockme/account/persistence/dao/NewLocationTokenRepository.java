package io.piontech.mockme.account.persistence.dao;

import io.piontech.mockme.account.persistence.domain.NewLocationToken;
import io.piontech.mockme.account.persistence.domain.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
