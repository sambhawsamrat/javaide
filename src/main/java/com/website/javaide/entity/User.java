package com.website.javaide.entity;

public class User {
    private final Long userId;
    private String name;
    private String email;
    private String password;
    private Boolean verified;

    public User(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, String name, String email, String password, Boolean verified) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.verified = verified;
    }

    public Long getUserId() {
        return userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
