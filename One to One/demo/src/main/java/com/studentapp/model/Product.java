package com.studentapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jdk.jfr.Category;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {
    @Id
    String pId;
    String pName;

    @ManyToMany
    private List<Category> categoryList = new ArrayList<>();

    public Product(String pId, String pName, List<Category> categoryList) {
        this.pId = pId;
        this.pName = pName;
        this.categoryList = categoryList;
    }

    public String getpId() {
        return pId;
    }

    public Product() {
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
