package com.bank.DAO;

import com.bank.Model.User;
import com.bank.Util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;

public class UserDAO {
    public UserDAO(JdbcDataSource dataSource) {
		// TODO Auto-generated constructor stub
	}

	public boolean addUser(User user) throws SQLException {
        String sql = "INSERT INTO Users (username, password) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            return stmt.executeUpdate() > 0;
        }
    }

    public User getUserByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM Users WHERE username = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
            return null;
        }
    }

	public Object saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserByEmail(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
