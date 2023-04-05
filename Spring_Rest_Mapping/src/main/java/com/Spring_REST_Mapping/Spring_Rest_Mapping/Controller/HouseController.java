package com.Spring_REST_Mapping.Spring_Rest_Mapping.Controller;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.House;
import com.Spring_REST_Mapping.Spring_Rest_Mapping.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
public class HouseController {
    @Autowired
    private HouseService houseService;

    @GetMapping
    private List<House> getAll(){
        return houseService.getAllHouses();
    }

    @GetMapping("/{id}")
    private House getById(@PathVariable int id){
        return houseService.getById(id);
    }

    @PostMapping
    private House add(@RequestBody House house){
        System.out.println("inside house add ");
        return houseService.add(house);
    }

    @PutMapping
    private House update(@RequestBody House house){
        return houseService.update(house);
    }

    @DeleteMapping("/{id}")
    private boolean delete(@PathVariable int id){

        return houseService.deleteById(id);
    }



}
