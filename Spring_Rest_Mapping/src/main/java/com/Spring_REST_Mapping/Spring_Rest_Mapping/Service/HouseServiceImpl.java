package com.Spring_REST_Mapping.Spring_Rest_Mapping.Service;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.House;
import com.Spring_REST_Mapping.Spring_Rest_Mapping.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    HouseRepository houseRepository;
    @Override
    public List<House> getAllHouses() {
        return houseRepository.findAll();
    }

    @Override
    public House add(House house) {

        return houseRepository.save(house);
    }

    @Override
    public House update(House house) {
        return houseRepository.save(house);
    }

    @Override
    public House getById(int houseId) {
        return houseRepository.findById(houseId).orElse(null);
    }

    @Override
    public boolean deleteById(int houseId) {
        if(houseRepository.existsById(houseId)) {
            houseRepository.deleteById(houseId);
            return true;
        }
        return false;
    }
}
