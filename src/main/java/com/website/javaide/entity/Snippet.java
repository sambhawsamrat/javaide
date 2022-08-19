package com.website.javaide.entity;

public class Snippet {

    private final Long userId;
    private final String hash;
    private String description;
    private String code;
    private String input;
    private String output;
    private Boolean visibility;

    public Snippet(Long userId, String hash) {
        this.userId = userId;
        this.hash = hash;
    }

    public Snippet(Long userId, String hash, String description, String code, String input, String output, Boolean visibility) {
        this.userId = userId;
        this.hash = hash;
        this.description = description;
        this.code = code;
        this.input = input;
        this.output = output;
        this.visibility = visibility;
    }

    public Long getUserId() {
        return userId;
    }

    public String getHash() {
        return hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(Boolean visibility) {
        this.visibility = visibility;
    }
}
