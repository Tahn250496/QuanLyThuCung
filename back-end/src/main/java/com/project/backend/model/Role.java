package com.project.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "ID_Role")
    private Integer idRole;

    @Column(name = "role")
    private Integer role;

    public Role() {
    }

    public Role(Integer role) {
        this.role = role;
    }

    public Integer getIdRole() {
        return this.idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getRole() {
        return this.role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
