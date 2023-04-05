package com.Spring_REST_Mapping.Spring_Rest_Mapping.Controller;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.Owner;
import com.Spring_REST_Mapping.Spring_Rest_Mapping.Service.HouseService;
import com.Spring_REST_Mapping.Spring_Rest_Mapping.Service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @GetMapping
    private List<Owner> getAll(){
        System.out.println("inside the get all");
       return ownerService.getAllOwners();
    }

    @GetMapping("/{id}")
    private Owner getById(@PathVariable int id){
        return ownerService.getById(id);
    }

    @PostMapping
    private Owner add(@RequestBody Owner owner){
        System.out.println("hi ----------------------- hola");
        return ownerService.add(owner);
    }

    @PutMapping
    private Owner update(@RequestBody Owner owner){
        return ownerService.update(owner);
    }

    @DeleteMapping("/{id}")
    private boolean delete(@PathVariable int id){
        return ownerService.deleteById(id);
    }

}
