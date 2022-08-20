package com.website.javaide.dao;

import com.website.javaide.entity.Snippet;

import java.util.List;

public interface SnippetDao {

    Snippet getSnippet(Long userId, String hash);
    void addSnippet(Snippet snippet);
    void updateSnippet(Snippet snippet);
    void deleteSnippet(Long userId, String hash);
    List<Snippet> getPublicSnippets(Long userId, int pageNumber);
    List<Snippet> getPrivateSnippets(Long userId, int pageNumber);
    int getPublicSnippetCount(Long userId);
    int getPrivateSnippetCount(Long userId);
    int getPublicSnippetPageCount(Long userId);
    int getPrivateSnippetPageCount(Long userId);
}
