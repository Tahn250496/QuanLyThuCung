package com.project.backend.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "ID_Prod")
    private Integer idProd;

    @Column(name = "prodName")
    private String prodName;

    @Column(name = "ID_Brand")
    private Integer idBrand;

    @Column(name = "ID_Cat")
    private Integer idCat;

    @Column(name = "price")
    private Float price;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "updatedAt")
    private java.sql.Timestamp updatedAt;

    @Column(name = "createdAt")
    private java.sql.Timestamp createdAt;

    @Column(name = "content")
    private String content;

    @Column(name = "URLImage")
    private String urlImage;

    @Column(name = "createdUser")
    private java.sql.Timestamp createdUser;

    @Column(name = "updatedUser")
    private java.sql.Timestamp updatedUser;

    public Product() {
    }

    public Product(String prodName, Integer idBrand, Integer idCat, Float price, Integer quantity, Timestamp updatedAt, Timestamp createdAt, String content, String urlImage, Timestamp createdUser, Timestamp updatedUser) {
        this.prodName = prodName;
        this.idBrand = idBrand;
        this.idCat = idCat;
        this.price = price;
        this.quantity = quantity;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.content = content;
        this.urlImage = urlImage;
        this.createdUser = createdUser;
        this.updatedUser = updatedUser;
    }

    public Integer getIdProd() {
        return this.idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getProdName() {
        return this.prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getIdBrand() {
        return this.idBrand;
    }

    public void setIdBrand(Integer idBrand) {
        this.idBrand = idBrand;
    }

    public Integer getIdCat() {
        return this.idCat;
    }

    public void setIdCat(Integer idCat) {
        this.idCat = idCat;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public java.sql.Timestamp getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(java.sql.Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public java.sql.Timestamp getCreatedUser() {
        return this.createdUser;
    }

    public void setCreatedUser(java.sql.Timestamp createdUser) {
        this.createdUser = createdUser;
    }

    public java.sql.Timestamp getUpdatedUser() {
        return this.updatedUser;
    }

    public void setUpdatedUser(java.sql.Timestamp updatedUser) {
        this.updatedUser = updatedUser;
    }
}
