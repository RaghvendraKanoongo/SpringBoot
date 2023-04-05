package com.Spring_REST_Mapping.Spring_Rest_Mapping.Service;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.House;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HouseService {
    public List<House> getAllHouses();

    public House add(House house);

    public House update(House house);

    public House getById(int houseId);

    public boolean deleteById(int houseId);
}
