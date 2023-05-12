package com.studentapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    String cId;
    String title;

    @ManyToMany(mappedBy = "categoryList", cascade = CascadeType.ALL)
    List<Product> productList = new ArrayList<>();
    public Category(String cId, String title, List<Product> productList) {
        this.cId = cId;
        this.title = title;
        this.productList = productList;
    }

    public Category() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
