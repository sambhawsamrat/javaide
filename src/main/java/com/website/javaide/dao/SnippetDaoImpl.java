package com.website.javaide.dao;

import com.website.javaide.constants.SnippetType;
import com.website.javaide.entity.Snippet;
import com.website.javaide.jdbc.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SnippetDaoImpl implements SnippetDao {

    private static final int ENTRY_PER_PAGE = 10;

    private final Connection connection;

    public SnippetDaoImpl() {
        connection = DatabaseConnection.getInstance();
    }

    @Override
    public Snippet getSnippet(Long userId, String hash) {
        Snippet snippet = null;
        PreparedStatement stmt = null;
        String query = "SELECT * FROM `snippet_table` WHERE `userid`=? AND `hash`=?";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, userId);
            stmt.setString(2, hash);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                snippet = new Snippet(userId, hash);
                snippet.setDescription(result.getString("description"));
                snippet.setVisibility(result.getInt("visibility"));
                snippet.setCode(result.getString("code"));
                snippet.setInput(result.getString("input"));
                snippet.setOutput(result.getString("output"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }

        return snippet;
    }

    @Override
    public void addSnippet(Snippet snippet) {
        PreparedStatement stmt = null;
        String query = "INSERT INTO `snippet_table` (`userid`, `hash`, `description`, `visibility`, `code`, `input`, `output`) VALUES(?, ?, ?, ?, ?, ?, ?)";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, snippet.getUserId());
            stmt.setString(2, snippet.getHash());
            stmt.setString(3, snippet.getDescription());
            stmt.setInt(4, snippet.getVisibility());
            stmt.setString(5, snippet.getCode());
            stmt.setString(6, snippet.getInput());
            stmt.setString(7, snippet.getOutput());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    @Override
    public void updateSnippet(Snippet snippet) {
        PreparedStatement stmt = null;
        String query = "UPDATE `snippet_table` SET `description`=?, `visibility`=?, `code`=?, `input`=?, `output`=? WHERE `userid`=? AND `hash`=?";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, snippet.getDescription());
            stmt.setInt(2, snippet.getVisibility());
            stmt.setString(3, snippet.getCode());
            stmt.setString(4, snippet.getInput());
            stmt.setString(5, snippet.getOutput());
            stmt.setLong(6, snippet.getUserId());
            stmt.setString(7, snippet.getHash());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    @Override
    public void deleteSnippet(Long userId, String hash) {
        PreparedStatement stmt = null;
        String query = "DELETE FROM `snippet_table` WHERE `userid`=? AND `hash`=? LIMIT 1";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, userId);
            stmt.setString(2, hash);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    @Override
    public List<Snippet> getPublicSnippets(Long userId, int pageNumber) {
        return getSnippets(userId, pageNumber, SnippetType.PUBLIC_SNIPPET);
    }

    @Override
    public List<Snippet> getPrivateSnippets(Long userId, int pageNumber) {
        return getSnippets(userId, pageNumber, SnippetType.PRIVATE_SNIPPET);
    }

    @Override
    public int getPublicSnippetCount(Long userId) {
        return getSnippetCount(userId, SnippetType.PUBLIC_SNIPPET);
    }

    @Override
    public int getPrivateSnippetCount(Long userId) {
        return getSnippetCount(userId, SnippetType.PRIVATE_SNIPPET);
    }

    @Override
    public int getPublicSnippetPageCount(Long userId) {
        return (int) Math.ceil(getPublicSnippetCount(userId) /  (ENTRY_PER_PAGE * 1.f));
    }

    @Override
    public int getPrivateSnippetPageCount(Long userId) {
        return (int) Math.ceil(getPrivateSnippetCount(userId) / (ENTRY_PER_PAGE * 1.f));
    }

    private List<Snippet> getSnippets(Long userId, int pageNumber, int visibility) {
        List<Snippet> list = new LinkedList<>();

        int start = (pageNumber - 1) * ENTRY_PER_PAGE;

        PreparedStatement stmt = null;
        String query = "SELECT * FROM `snippet_table` WHERE `userid`=? AND `visibility`=? LIMIT ?, ?";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, userId);
            stmt.setInt(2, visibility);
            stmt.setInt(3, start);
            stmt.setInt(4, ENTRY_PER_PAGE);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                Snippet snippet = new Snippet(userId, result.getString("hash"));
                snippet.setDescription(result.getString("description"));
                snippet.setVisibility(result.getInt("visibility"));
                snippet.setCode(result.getString("code"));
                snippet.setInput(result.getString("input"));
                snippet.setOutput(result.getString("output"));
                list.add(snippet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }

        return list;
    }

    private int getSnippetCount(Long userId, int visibility) {
        int count = 0;
        PreparedStatement stmt = null;
        String query = "SELECT COUNT(*) AS `snippet_count` FROM `snippet_table` WHERE `userid`=? AND `visibility`=?";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, userId);
            stmt.setInt(2, visibility);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                count = result.getInt("snippet_count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }

        return count;
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
