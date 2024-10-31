package com.skylab.akademi.dataAccess;

import com.skylab.akademi.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantDao extends JpaRepository<Restaurant, Integer> {


}
