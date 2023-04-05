package com.Spring_REST_Mapping.Spring_Rest_Mapping.Service;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.Owner;
import com.Spring_REST_Mapping.Spring_Rest_Mapping.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OwnerServiceImpl implements OwnerService{
    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner add(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner getById(int ownerId) {
        return ownerRepository.findById(ownerId).orElse(null);
    }

    @Override
    public boolean deleteById(int ownerId) {
        if(ownerRepository.existsById(ownerId))
        {
            ownerRepository.deleteById(ownerId);
            return true;
        }
        return false;
    }
}
