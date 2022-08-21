package com.website.javaide.pojo;

public class UpdateUser {

    private final Long userId;
    private String name;
    private String email;
    private String password;
    private Integer verified;
    private Integer updateType;

    public UpdateUser(Long userId) {
        this.userId = userId;
    }

    public UpdateUser(Long userId, String name, String email, String password, Integer verified, Integer updateType) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.verified = verified;
        this.updateType = updateType;
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

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }
}
