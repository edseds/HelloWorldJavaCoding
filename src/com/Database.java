package com;
import java.sql.*;


public class Database {
    static final String DB_URL = "jdbc:mysql://localhost/store";
    //  Database credentials
    static final String USER = "edgars";
    static final String PASS = "qwerty";
    static Connection conn = null;
    static Statement stmt = null;

    public static void selectExample() throws SQLException {
        //String sql = "SELECT * FROM shoes WHERE ID=1235";
        String sql = "SELECT * FROM shoes";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("ID") + " " + rs.getString("Name"));
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        rs.close();
    }

    public static void insertExample() throws SQLException {
        String sql = "INSERT INTO shoes(ID,Name,Size,Colour,Brand) VALUES (1235,'Riga',34,'Red','Latvia')";
        System.out.println("Inserted: " + stmt.executeUpdate(sql));
    }

    public static void updateExample() throws SQLException {
        String sql = "UPDATE shoes\n" +
                "SET Name = 'Riga1'\n" +
                "WHERE Brand = 'Latvia'";
        System.out.println("Updated: " + stmt.executeUpdate(sql));
    }

    public static void deleteExample() throws SQLException {
        String sql = "DELETE FROM shoes WHERE ID=1234";
        System.out.println("Deleted: " + stmt.executeUpdate(sql));
    }

    public static void joinExample() throws SQLException {
        String sql = "SELECT s.ID,s.Name,q.Amount FROM shoes s JOIN quantity q on s.ID=q.ID";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getInt("s.ID") + " "
                    + rs.getString("s.Name") + " " + rs.getString("q.Amount"));
        }
        rs.close();

    }

    public static void main(String[] args) {
        try {
            //Return connection instance
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Creating statement...");

            //Create statement object
            stmt = conn.createStatement();

            selectExample();
            //insertExample();
            updateExample();
            deleteExample();
            joinExample();
            insertWithValue(432, "Riga5", 32, "Grey", "Latvia");

            stmt.close();
            conn.close();
        } catch (SQLException sqlException) {
            System.out.println("Error:" + sqlException.getMessage());
        }
    }

    public static void insertWithValue(int id, String name, int size, String colour,
                                       String brand) throws SQLException {
        String sql = "INSERT INTO shoes(ID,Name,Size,Colour,Brand) VALUES (+" +
                id + ",'" + name + "'," + size + ",'" + colour + "','" + brand + "')";
        stmt.execute(sql);
    }
}