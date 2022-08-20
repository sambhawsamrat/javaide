package com.website.javaide.dao;

import com.website.javaide.entity.Snippet;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SnippetDaoImpl implements SnippetDao {

    @Override
    public Snippet getSnippet(Long userId, String hash) {
        return null;
    }

    @Override
    public void addSnippet(Snippet snippet) {

    }

    @Override
    public void updateSnippet(Snippet snippet) {

    }

    @Override
    public void deleteSnippet(Long userId, String hash) {

    }

    @Override
    public List<Snippet> getPublicSnippets(int pageNumber) {
        return null;
    }

    @Override
    public List<Snippet> getPrivateSnippets(int pageNumber) {
        return null;
    }

    private void close(PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
