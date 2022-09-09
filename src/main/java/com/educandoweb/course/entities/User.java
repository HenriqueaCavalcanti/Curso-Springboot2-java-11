package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private static final long serialVersionUID = 1l;

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String pessword;

    public User() {
    }

    public User(Long id, String name, String email, String phone, String pessword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pessword = pessword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPessword() {
        return pessword;
    }

    public void setPessword(String pessword) {
        this.pessword = pessword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
