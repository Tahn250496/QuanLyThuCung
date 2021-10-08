package com.project.backend.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "orderdetail")
public class Orderdetail {
    @Id
    @Column(name = "ID_OrdDetail")
    private Integer idOrdDetail;

    @Column(name = "ID_Prod")
    private Integer idProd;

    @Column(name = "ID_Ord")
    private Integer idOrd;

    @Column(name = "updatedAt")
    private java.sql.Timestamp updatedAt;

    @Column(name = "createdAt")
    private java.sql.Timestamp createdAt;

    @Column(name = "unitPrice")
    private Double unitPrice;

    @Column(name = "quantity")
    private Integer quantity;

    public Orderdetail() {
    }

    public Orderdetail(Integer idProd, Integer idOrd, Timestamp updatedAt, Timestamp createdAt, Double unitPrice, Integer quantity) {
        this.idProd = idProd;
        this.idOrd = idOrd;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Integer getIdOrdDetail() {
        return this.idOrdDetail;
    }

    public void setIdOrdDetail(Integer idOrdDetail) {
        this.idOrdDetail = idOrdDetail;
    }

    public Integer getIdProd() {
        return this.idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public Integer getIdOrd() {
        return this.idOrd;
    }

    public void setIdOrd(Integer idOrd) {
        this.idOrd = idOrd;
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

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
