package com.Spring_REST_Mapping.Spring_Rest_Mapping.Service;

import com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity.Owner;
import org.springframework.stereotype.Service;

import java.util.List;
public interface OwnerService {
    public List<Owner> getAllOwners();

    public Owner add(Owner owner);

    public Owner update(Owner owner);

    public Owner getById(int ownerId);

    public boolean deleteById(int ownerId);
}
