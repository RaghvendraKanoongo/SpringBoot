package com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ownerId;
    String ownerName;
    @OneToMany(mappedBy = "owner")
    private List<House> houses;

    public Owner() {
    }

    public Owner(int ownerId, String ownerName, List<House> houses) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.houses = houses;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}
