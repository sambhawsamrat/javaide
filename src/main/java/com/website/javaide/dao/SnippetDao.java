package com.website.javaide.dao;

import com.website.javaide.entity.Snippet;

import java.util.List;

public interface SnippetDao {

    Snippet getSnippet(Long userId, String hash);
    void addSnippet(Snippet snippet);
    void updateSnippet(Snippet snippet);
    void deleteSnippet(Long userId, String hash);
    List<Snippet> getPublicSnippets(int pageNumber);
    List<Snippet> getPrivateSnippets(int pageNumber);
}
