package xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb1", "root", "Harshi@17");

            String insertSql = "REPLACE INTO students VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSql);

            Object[][] students = {
                {1, "Alice"},
                {2, "Bob"},
                {3, "Can"},
                {4, "David"},
                {5, "Eve"},
                {6, "Fimona"},
            };

            for (Object[] student : students) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            pstmt.close();

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

           
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.err.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
