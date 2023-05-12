package com.Spring_REST_Mapping.Spring_Rest_Mapping.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class House {

    @Id
    int houseNo;

    @ManyToOne
    @JoinColumn(name = "Owner_Id")
    private Owner owner;

    public House(int houseNo, Owner owner) {
        this.houseNo = houseNo;
        this.owner = owner;
    }
    public House() {

    }
}
