package com.Spring_REST_Mapping.Spring_Rest_Mapping.Repository;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Integer> {
}
