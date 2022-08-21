package com.website.javaide.service;

import com.website.javaide.dao.SnippetDao;
import com.website.javaide.dao.SnippetDaoImpl;
import com.website.javaide.entity.Snippet;

import java.util.List;

public class SnippetServiceImpl implements SnippetService {

    private final SnippetDao snippetDao;

    public SnippetServiceImpl() {
        snippetDao = new SnippetDaoImpl();
    }

    @Override
    public Snippet getSnippet(Long userId, String hash) {
        return snippetDao.getSnippet(userId, hash);
    }

    @Override
    public void addSnippet(Snippet snippet) {
        snippetDao.addSnippet(snippet);
    }

    @Override
    public void updateSnippet(Snippet snippet) {
        snippetDao.updateSnippet(snippet);
    }

    @Override
    public void deleteSnippet(Long userId, String hash) {
        snippetDao.deleteSnippet(userId, hash);
    }

    @Override
    public List<Snippet> getPublicSnippets(Long userId, int pageNumber) {
        return snippetDao.getPublicSnippets(userId, pageNumber);
    }

    @Override
    public List<Snippet> getPrivateSnippets(Long userId, int pageNumber) {
        return snippetDao.getPrivateSnippets(userId, pageNumber);
    }

    @Override
    public int getPublicSnippetCount(Long userId) {
        return snippetDao.getPublicSnippetCount(userId);
    }

    @Override
    public int getPrivateSnippetCount(Long userId) {
        return snippetDao.getPrivateSnippetCount(userId);
    }

    @Override
    public int getPublicSnippetPageCount(Long userId) {
        return snippetDao.getPublicSnippetPageCount(userId);
    }

    @Override
    public int getPrivateSnippetPageCount(Long userId) {
        return snippetDao.getPrivateSnippetPageCount(userId);
    }
}
